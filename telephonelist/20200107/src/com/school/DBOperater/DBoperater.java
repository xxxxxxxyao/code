package com.school.DBOperater;


import com.school.User.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBoperater {
    private static String URL =
            "jdbc:mysql://localhost/telephone_system";
    private static String USER = "root";
    private static String PASSWORD = "";

    //获取数据源
    public static DataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }

    //1.添加用户操作
    public static void insertintotable(User user) {
        //1.获取数据源，初始化
        Connection connection = null;
        PreparedStatement pstmt = null;


        try {
            //获取连接
            connection = getDataSource().getConnection();

            String sql = "insert into telelist values(?,?,?,?,?)";
            pstmt = connection.prepareStatement(sql);


            pstmt.setString(1, user.getTelenumber());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getAddress());
            pstmt.setInt(4, user.getCode());
            pstmt.setString(5, user.getEmail());
            pstmt.execute();     //执行


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    //2.查询所有用户操作
    public static List selectalluser(){
        //1.获取数据源
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;       //结果集

        List<User> list=new ArrayList<>();

        try {
            connection=getDataSource().getConnection();
            String sql="select * from telelist";
            pstmt=connection.prepareStatement(sql);

            rs=pstmt.executeQuery();    //查询

            while(rs.next()){
                User user=new User();
                user.setTelenumber(rs.getString("telenumber"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setCode(rs.getInt("code"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(connection !=  null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    //3.按姓名查询
    public static User selectuser(String name){
        //1.获取资源
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        User user=new User();

        try {
            connection=getDataSource().getConnection();

            String sql="select name,address,telenumber,code from telelist where name=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setString(1,name);

            rs=pstmt.executeQuery();

            while(rs.next()){
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setTelenumber(rs.getString("telenumber"));
                user.setCode(rs.getInt("code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    //4.更新表中字段
    public static void update(User user,String name){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="update telelist set telenumber=?,address=?,code=?,email=?  where name=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setString(1, user.getTelenumber());
            pstmt.setString(2, user.getAddress());
            pstmt.setInt(3, user.getCode());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5,name);
            pstmt.execute();     //执行
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(connection !=  null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //5.按姓名排序
    public static List oroupbyname(){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        List<User> list=new ArrayList<>();


        try {
            connection=getDataSource().getConnection();

            String sql="select * from telelist order by name";
            pstmt=connection.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()){
                User user=new User();
                user.setTelenumber(rs.getString("telenumber"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setCode(rs.getInt("code"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(connection !=  null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    //6.按邮箱排序
    public static List oroupbyemail(){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        List<User> list=new ArrayList<>();


        try {
            connection=getDataSource().getConnection();

            String sql="select * from telelist order by email";
            pstmt=connection.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while (rs.next()){
                User user=new User();
                user.setTelenumber(rs.getString("telenumber"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setCode(rs.getInt("code"));
                user.setEmail(rs.getString("email"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(connection !=  null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
