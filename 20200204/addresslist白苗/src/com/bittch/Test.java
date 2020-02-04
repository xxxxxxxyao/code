package com.bittch;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.*;

/**
 * @Author: BaiMiao
 * @Date: 2020/1/6 14:52
 * @Description:
 * 执行SQL
 * select：executeQurey；Statement；RestltSet；
 * insert/update/delete: executeUpdate ； Statement
 */
public class Test {

    /*public static  DataSource getDataSource()
    {
        //数据源 连接可重复利用
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost:3306/addresslist1?" +
                "autoReconnect=true&encodeing=UTF-8b ");
        ds.setUser("root");
        ds.setPassword("1227");

        return ds;
    }*/

    public static void insertIntoTable(){

        //1.加载驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //2.获取连接 127.0.0.1
        String url="jdbc:mysql://localhost:3306/addresslist1?" +
                "autoReconnect=true&encodeing=UTF-8b ";
        String username="root";
        String password="1227";
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
       // Connection connection=null;
        //DataSource dataSource=null;

        //3.执行SQL
        Statement statement=null;
        try {
           // dataSource=getDataSource();
            //connection=dataSource.getConnection();
            statement =connection.createStatement();
            String sql="insert into addresslist values('13662247755','苹果','上海','718100','41461118','1527374233')";
            statement.executeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //4.关闭资源
            try{
                connection.close();
                statement.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
 public static void displayAll(){
    //1.加载驱动
    try{
        Class.forName("com.mysql.jdbc.Driver");
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
    //2.获取连接 127.0.0.1
    String url="jdbc:mysql://localhost:3306/addresslist1?" +
            "autoReconnect=true&encodeing=UTF-8b ";
    String username="root";
    String password="1227";
    Connection connection=null;
    try{
        connection=DriverManager.getConnection(url,username,password);
    }catch (SQLException e){
        e.printStackTrace();
    }
    //3.执行SQL
    Statement statement=null;
    ResultSet resultSet=null;
    try {
        statement =connection.createStatement();
        String sqlStr = "select * from addresslist";
        resultSet = statement.executeQuery(sqlStr);
        while (resultSet.next()){
            String name=resultSet.getString("姓名");
            String pn=resultSet.getString("电话号码");
            String address=resultSet.getString("地址");
            String postalcode=resultSet.getString("邮政编码");
            String hn=resultSet.getString("家庭电话");
            String email=resultSet.getString("Email");
            System.out.println("姓名 "+name+","+"电话号码 "+pn+','+"地址 "+address+','
                    +"邮政编码 "+postalcode+','+"家庭电话 "+hn+','+"Email "+email);
        }
    }catch (SQLException e){
        e.printStackTrace();
    }finally {
        //4.关闭资源
        try{
            connection.close();
            statement.close();
            resultSet.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
 public static void seek(){
     //1.加载驱动
     try{
         Class.forName("com.mysql.jdbc.Driver");
     }catch (ClassNotFoundException e){
         e.printStackTrace();
     }
     //2.获取连接 127.0.0.1
     String url="jdbc:mysql://localhost:3306/addresslist1?" +
             "autoReconnect=true&encodeing=UTF-8b ";
     String username="root";
     String password="1227";
     Connection connection=null;
     try{
         connection=DriverManager.getConnection(url,username,password);
     }catch (SQLException e){
         e.printStackTrace();
     }
     //3.执行SQL
     Statement statement=null;
     ResultSet resultSet=null;
     try {
         statement =connection.createStatement();
         String sqlStr = "select * from addresslist where 姓名 like '小源' ";
         resultSet = statement.executeQuery(sqlStr);
         while (resultSet.next()){
             String name=resultSet.getString("姓名");
             String pn=resultSet.getString("电话号码");
             String address=resultSet.getString("地址");
             String postalcode=resultSet.getString("邮政编码");
             String hn=resultSet.getString("家庭电话");
             String email=resultSet.getString("Email");
             System.out.println("姓名 "+name+","+"电话号码 "+pn+','+"地址 "+address+','
                     +"邮政编码 "+postalcode+','+"家庭电话 "+hn+','+"Email "+email);
         }
     }catch (SQLException e){
         e.printStackTrace();
     }finally {
         //4.关闭资源
         try{
             connection.close();
             statement.close();
             resultSet.close();
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
 }
    public static void modifyinformation(){
        //1.加载驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //2.获取连接 127.0.0.1
        String url="jdbc:mysql://localhost:3306/addresslist1?" +
                "autoReconnect=true&encodeing=UTF-8b ";
        String username="root";
        String password="1227";
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        //3.执行SQL
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            statement =connection.createStatement();
            String sql = "update addresslist set 电话号码='19992297755' " +
                    "where 姓名='小战'";
            statement.executeUpdate(sql);
            String sqlStr="select * from addresslist where 姓名 like '小战' ";
            resultSet = statement.executeQuery(sqlStr);
            while (resultSet.next()){
                String name=resultSet.getString("姓名");
                String pn=resultSet.getString("电话号码");
                String address=resultSet.getString("地址");
                String postalcode=resultSet.getString("邮政编码");
                String hn=resultSet.getString("家庭电话");
                String email=resultSet.getString("Email");
                System.out.println("姓名 "+name+","+"电话号码 "+pn+','+"地址 "+address+','
                        +"邮政编码 "+postalcode+','+"家庭电话 "+hn+','+"Email "+email);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //4.关闭资源
            try{
                connection.close();
                statement.close();
                resultSet.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void namesort(){
        //1.加载驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //2.获取连接 127.0.0.1
        String url="jdbc:mysql://localhost:3306/addresslist1?" +
                "autoReconnect=true&encodeing=UTF-8b ";
        String username="root";
        String password="1227";
        Connection connection=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        //3.执行SQL
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            statement =connection.createStatement();
            String sqlStr = "select 姓名,电话号码 from addresslist order by 姓名 ASC";
            resultSet = statement.executeQuery(sqlStr);
            while (resultSet.next()){
                String name=resultSet.getString("姓名");
                String pn=resultSet.getString("电话号码");
                System.out.println("姓名 "+name+","+"电话号码 "+pn);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //4.关闭资源
            try{
                connection.close();
                statement.close();
                resultSet.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       // insertIntoTable();
        //displayAll();
       //seek();
        //modifyinformation();
        namesort();
    }
}
