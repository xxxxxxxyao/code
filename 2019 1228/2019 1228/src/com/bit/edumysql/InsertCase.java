package com.bit.edumysql;

import java.sql.*;

public class InsertCase{
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
            String sql="insert into telelist values(12635909009,'豆豆','上海',710090,'273633333@qq.com')";
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


    public static void selecttable(){
        Connection connection=null;
        Statement stmt=null;
        ResultSet rs=null;

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            connection=DriverManager.getConnection("jdbc:mysql://localhost/telephonelist","root","");
            //3.创建语句
            stmt=connection.createStatement();
            //4.执行
            String sql="select * from telelist";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                Integer col1=rs.getInt("col1");
                String col2=rs.getString("col2");
                System.out.println("col1="+col1+"col2"+col2);
            }
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