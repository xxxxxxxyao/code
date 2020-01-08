package com.biteedu.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import  com.biteedu.DBdeal.Student;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

//数据库处理模块
public class DBoperater {
    private static String URL=
            "jdbc:mysql://localhost/course_system";
    private static String USER="root";
    private static String PASSWORD = "";

    public static DataSource getDataSource(){
        MysqlDataSource dataSource =
                new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }

    //1.插入学生表
    public static void insertstudent(Student stu) {
        // 1. 获取数据源
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = getDataSource().
                    getConnection();

            String sql =
                    "insert into student values(?,?,?)";

            pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, stu.getSno());
            pstmt.setInt(2, stu.getClassid());
            pstmt.setString(3, stu.getSname());

            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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



    //2.查询学生表
    public static Student selectStudent(int sn) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Student student = new Student();

        try {
            connection = getDataSource().
                    getConnection();

            String sql =
                    "select * from Student where sn=?";

            pstmt = connection.prepareStatement(sql);

            System.out.println(pstmt);

            pstmt.setInt(1, sn);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                student.setSno(rs.getInt("sno"));
                student.setSname(rs.getString("sname"));
                student.setClassid(rs.getInt("classid"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
        return student;
    }


    //3.插入班级表
    //4.查询班级表
    //5.插入课程表
    //6.查询课程表
    //7.插入教师表
    //8.查询教师表
    //9.插入take
    //10.查询take
    //11.插入teach
    //12.查询teach
}
