package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        System.out.println("请输入你的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("请输入您的身份(1 表示管理员， 0 表示普通用户);");
        int who=scanner.nextInt();
        if(who==1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }

    public static void main(String[] args) {
        //1.将book调用出来，有书了
        BookList bookList=new BookList();
        //2.创建用户
        User user=login();
        //3.进入主循环
        while(true){
            int choice=user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
