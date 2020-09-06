package dao;

import common.JavaImageServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageDao {
    public void insert(Image image){
        //1.获取数据库连接
        Connection connection=DBUtil.getConnection();
        //2.创建拼装sql语句
        String sql="insert into image_table values(null, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement=null;
        try {
            statement=connection.prepareStatement(sql);
            statement.setString(1,image.getImageName());
            statement.setInt(2,image.getSize());
            statement.setString(3,image.getUploadTime());
            statement.setString(4,image.getContentType());
            statement.setString(5,image.getPath());
            statement.setString(6,image.getMd5());
            //3.执行sql
            int ret=statement.executeUpdate();
            if(ret!=1){
                throw new JavaImageServerException("插入数据库出错");
            }
        } catch (SQLException | JavaImageServerException e) {
            e.printStackTrace();
        }finally {
            //4.关闭连接
            DBUtil.close(connection,statement,null);
        }
    }

    public List<Image> selectAll(){
        List<Image> images=new ArrayList<>();
        Connection connection=DBUtil.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        String sql="select * from image_table";
        try {
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
                Image image=new Image();

                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                images.add(image);
            }
            return images;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }

    public Image selectOne(int imageId){
        Connection connection=DBUtil.getConnection();

        String sql="select * from image_table where imageId= ?";
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,imageId);
            resultSet=statement.executeQuery();

            if(resultSet.next()) {
                Image image = new Image();

                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                return image;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }


    public void delete(int imageId){
        Connection connection=DBUtil.getConnection();
        String sql="delete from image_table where imageId=?";
        PreparedStatement statement=null;

        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1,imageId);
            int ret=statement.executeUpdate();
            if(ret!=1){
                throw new JavaImageServerException("删除数据库操作失败");
            }
        } catch (SQLException | JavaImageServerException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,null);
        }
    }

    public Image selectByMd5(String md5){
        Connection connection=DBUtil.getConnection();

        String sql="select * from image_table where md5= ?";
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        try {
            statement=connection.prepareStatement(sql);
            statement.setString(1,md5);
            resultSet=statement.executeQuery();

            if(resultSet.next()) {
                Image image = new Image();

                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                return image;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }

    public static void main(String[] args) {
        /*Image image=new Image();
        image.setImageName("2.png");
        image.setSize(200);
        image.setUploadTime("20200322");
        image.setContentType("image1/png");
        image.setPath("./data/1.png");
        image.setMd5("11223322");

        ImageDao imagedao=new ImageDao();
        imagedao.insert(image);*/


        ImageDao image=new ImageDao();
        image.delete(1);
    }
}
