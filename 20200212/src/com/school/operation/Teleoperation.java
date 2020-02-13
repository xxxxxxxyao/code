package com.school.operation;
import  com.school.User.User;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Teleoperation {
  private static String URL="jdbc:mysql://localhost/telephone_system";
  private static String USER="root";
  private static String PASSWORD="";


   public static DataSource getDataSource(){
      MysqlDataSource dataSource=new MysqlDataSource();
      dataSource.setURL(URL);
      dataSource.setUser(USER);
      dataSource.setPassword(PASSWORD);

      return dataSource;
   }


  //1.添加用户
    public static void insert(User user) {
        //1.获取数据源
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
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
    public static List select(){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        List<User> list=new ArrayList<>();

        try {
            connection=getDataSource().getConnection();

            String sql="select * from telelist";
            pstmt=connection.prepareStatement(sql);

            rs=pstmt.executeQuery();

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
        } finally {
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


    //3.按照姓名查询
    public static User select1(String name){
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
        } finally {
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
}
