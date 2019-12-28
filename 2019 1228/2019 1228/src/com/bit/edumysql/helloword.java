package com.bit.edumysql;

import sun.rmi.transport.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class helloword {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");   //加载数据库驱动

            java.sql.Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/","root","");

            Statement stmt=connection.createStatement();

            stmt.execute("create database my_jdbc_db");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
