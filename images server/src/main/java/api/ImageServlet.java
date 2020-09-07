package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Image;
import dao.ImageDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //要考虑到查看所有图片属性和查看指定图片
        //如何区分？看url是否带有参数
        //存在参数就查看指定图片属性，否则就查看所有图片属性
        String imageId=req.getParameter("imageId");
        if(imageId==null || imageId.equals("")){
            selectAll(req,resp);
        }else{
            selectOne(imageId,resp);
        }
    }

    private void selectOne(String imageId, HttpServletResponse resp) throws IOException{
        resp.setContentType("application/json;charset=utf-8");
        ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(Integer.parseInt(imageId));
        Gson gson=new GsonBuilder().create();
        String  jsonData=gson.toJson(image);
        resp.getWriter().write(jsonData);
    }

    private void selectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json;charset=utf-8");
        ImageDao imageDao=new ImageDao();
        List<Image> images=imageDao.selectAll();
        Gson gson=new GsonBuilder().create();
        //gson自动完成格式转换
        String jsonData=gson.toJson(images);
        resp.getWriter().write(jsonData);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取图片的属性信息，并且存入数据库

        //创建factory和upload对象，为了获取到图片的属性，固定的逻辑
        FileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> items=null;
        //通过upload对象进一步解析请求
        try {
            items=upload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write("{\"ok\":false,\"reason\":\"请求解析失败\"}");
            return;
        }

        //将FileItem中的属性提取出来，转换成Image对象，才能存放到数据库中
        FileItem fileItem=items.get(0);
        Image image=new Image();
        image.setImageName(fileItem.getName());
        image.setSize((int)fileItem.getSize());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
        image.setUploadTime(simpleDateFormat.format(new Date()));
        image.setContentType(fileItem.getContentType());
        image.setMd5(DigestUtils.md5Hex(fileItem.get()));

        image.setPath("./image/"+image.getMd5());
        //存入数据库
        ImageDao imageDao=new ImageDao();

        Image exitsImage=imageDao.selectByMd5(image.getMd5());
        imageDao.insert(image);
        //2.获取图片的内容信息，并且写入磁盘
        if(exitsImage==null) {
            File file = new File(image.getPath());
            try {
                fileItem.write(file);
            } catch (Exception e) {
                e.printStackTrace();
                resp.setContentType("application/json;charset=utf-8");
                resp.getWriter().write("{\"ok\":false,\"reason\":\"磁盘写入失败\"}");
                return;
            }
        }
        //3.给客户端返回一个数据
        resp.sendRedirect("images.html");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        String imageId=req.getParameter("imageId");
        if(imageId==null || imageId.equals("")){
            resp.setStatus(200);
            resp.getWriter().write("\"ok\":false,\"reason\":\"解析请求失败\"}");
            return;
        }
        ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(Integer.parseInt(imageId));
        if(image==null){
                resp.setStatus(200);
                resp.getWriter().write("\"ok\":false,\"reason\":\"id在数据库中不存在\"}");
                return;
        }

        //删除数据库中数据
        imageDao.delete(Integer.parseInt(imageId));

        //删除本地磁盘文件
        File file=new File(image.getPath());
        file.delete();
        resp.setStatus(200);
        resp.getWriter().write("\"ok\":true");
    }
}
