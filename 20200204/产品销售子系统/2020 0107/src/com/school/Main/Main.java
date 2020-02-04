package com.school.Main;

import com.school.Custmer.Custmer;
import com.school.DBoperater.DBoperater;
import com.school.Orderlist.Orderlist;
import com.school.Production.Production;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //增加产品
        /*Production p=new Production();
        p.setPid(6);
        p.setName("床");
        p.setPrice(1000);
        p.setCount(10);
        DBoperater.insert1(p);*/

        //修改1号产品信息
       /* Production p1=new Production();
        p1.setName("写字台");
        p1.setPrice(200);
        p1.setCount(200);
        DBoperater.update1(p1,1);*/


        //删除1号产品
        //DBoperater.delete1(6);

        //添加客户
        /*Custmer c=new Custmer();
        c.setCid(1002);
        c.setName("李四");
        c.setAddress("未央区");
        c.setTelenumber("18892736483");
        c.setCredit("良好");
        c.setMoney(600);
        DBoperater.insert2(c);*/

        //修改客户信息
        /*Custmer c=new Custmer();
        c.setName("angel");
        c.setAddress("曲江");
        c.setTelenumber("18928392893");
        c.setCredit("良好");
        c.setMoney(1000);
        DBoperater.update2(c,1005);*/

        //删除1005用户
        //DBoperater.delete2(1005);


        //下订单
       /* Orderlist o=new Orderlist();
        o.setOid(10008);
        o.setItem(1);
        o.setDate(new Date((long)20200109));
        o.setCount(5);
        o.setCustmerid(1002);
        o.setOpid(3);
        DBoperater.order(o);*/


        //查询订单
         /* List list=DBoperater.select(1001);
          System.out.println(list);*/

       //查询库存
//        Production p=DBoperater.select2(2);
//        System.out.println(p);

      //统计1001用户金额
        /*List list=DBoperater.Count(1002);
        System.out.println(list);*/
    }
}
