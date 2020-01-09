package com.bit.edumysql;

import sun.rmi.transport.Connection;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Helloword {

    public static void main(String[] args) {
        java.sql.Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");   //注册驱动，加载数据库驱动，driver用来打开mysql

            //获取连接
          connection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");  //协议

           stmt = connection.createStatement();

            stmt.execute("create database myjava");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
