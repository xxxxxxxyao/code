package com.biteedu.Main;

import  com.biteedu.DBdeal.Student;

import com.biteedu.db.DBoperater;


public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setSno(2019001);
        stu.setClassid(1);
        stu.setSname("didi");
        DBoperater.insertstudent(stu);
    }
}
