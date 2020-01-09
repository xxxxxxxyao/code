package com.school.Main;

import com.school.DBOperater.DBoperater;
import com.school.User.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.插入用户
       /* User user=new User();
        user.setTelenumber("1018982873");
        user.setName("墩墩");
        user.setAddress("北京");
        user.setCode(710000);
        user.setEmail("187283722@qq.com");
        DBoperater.insertintotable(user);*/

        /*
        User user2=new User();
        user2.setTelenumber("18928374832");
        user2.setName("豆豆");
        user2.setAddress("上海");
        user2.setCode(710011);
        user2.setEmail("271874672637@qq.com");
        DBoperater.insertintotable(user2);*/

       /* User user3=new User();
        user3.setTelenumber("18389382938");
        user3.setName("lisa");
        user3.setAddress("上海");
        user3.setCode(710011);
        user3.setEmail("12777366473@qq.com");
        DBoperater.insertintotable(user3);*/


        //2.查询所有用户
       /* List userlist=DBoperater.selectalluser();
        System.out.println(userlist);*/

       //3.按要求查询用户
         /* User user=DBoperater.selectuser("豆豆");
          System.out.println(user);*/


        //4.排序
       /* List user1=DBoperater.oroupbyname();
        System.out.println(user1);

        List user2=DBoperater.oroupbyemail();
        System.out.println(user2);*/

       //5.更新表
        User user=new User();
        user.setTelenumber("12783746728");
        user.setAddress("巴黎");
        user.setCode(710027);
        user.setEmail("6276376273@qq.com");
        DBoperater.update(user,"墩墩");
    }
}
