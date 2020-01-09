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
       /* Production p=new Production();
        p.setPid(6);
        p.setName("梳子");
        p.setPrice(20);
        p.setCount(100);
        DBoperater.insert1(p);*/

        //修改1号产品信息
        /*Production p1=new Production();
        p1.setName("写字台");
        p1.setPrice(20);
        p1.setCount(900);
        DBoperater.update1(p1,1);*/


        //删除6号产品
        //DBoperater.delete1(6);

        //添加客户
       /* Custmer c=new Custmer();
        c.setCid(1002);
        c.setName("李四");
        c.setAddress("未央区");
        c.setTelenumber("18892736483");
        c.setCredit("良好");
        c.setMoney(600);
        DBoperater.insert2(c);*/

        //修改客户信息
        /*Custmer c=new Custmer();
        c.setName("豆豆");
        c.setAddress("曲江");
        c.setTelenumber("18928392893");
        c.setCredit("优秀");
        c.setMoney(1000);
        DBoperater.update2(c,1001);*/

        //删除1004用户
        //DBoperater.delete2(1003);


        //下订单
      /* Orderlist o=new Orderlist();
        o.setOid(10010);
        o.setItem(1);
        o.setDate(Date.valueOf("2020-01-09"));
        o.setCount(100);
        o.setCustmerid(1002);
        o.setOpid(1);
        DBoperater.order(o);*/

        //查询订单
        /* List list=DBoperater.select(1001);
         System.out.println(list);
*/
       //查询库存
       /* Production p=DBoperater.select2(1);
        System.out.println(p);
        */

      //统计1002用户金额
       /* List list=DBoperater.Count(1002);
        System.out.println(list);*/
    }
}
