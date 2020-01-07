package com.school.java;

import java.sql.*;

public class Test{
    public static void insertintotable(){
        Connection connection=null;
        Statement stmt=null;

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            connection=DriverManager.getConnection("jdbc:mysql://localhost/telephonesystem","root","");

            //3.创建语句
            stmt=connection.createStatement();
            //4.执行
            String sql="insert into telelist values(198263746323,'蛋蛋','上海',710022,'2790909099@qq.com')";
            stmt.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //5.关闭资源
            try {
                if(stmt != null){
                    stmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //creatTable();
        insertintotable();
        //selecttable();
    }
}