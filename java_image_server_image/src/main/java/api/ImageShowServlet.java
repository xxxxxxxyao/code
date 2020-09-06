package api;

import dao.Image;
import dao.ImageDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;

public class ImageShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.解析出imageId
        String imageId=req.getParameter("imageId");
        if(imageId==null || imageId.equals("")){
            resp.setContentType("application/json;charset:utf-8");
            resp.getWriter().write("\"ok\":false,\"reason\":\"imageId解析请求失败\"}");
            return;
        }
        //2.根据imageId查找数据
        ImageDao imageDao=new ImageDao();
        Image image=imageDao.selectOne(Integer.parseInt(imageId));

        //3.根据路径打开文件，读取其中的内容，写入到响应对象中
        resp.setContentType(image.getContentType());
        File file=new File(image.getPath());
        OutputStream outputStream=resp.getOutputStream();
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] buffer=new byte[1024];
        while(true){
            int len=fileInputStream.read(buffer);
            if(len==-1){
                break;
            }
            outputStream.write(buffer);
        }
        fileInputStream.close();
        outputStream.close();
    }
}
