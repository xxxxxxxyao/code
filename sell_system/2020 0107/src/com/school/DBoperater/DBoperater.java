package com.school.DBoperater;

import com.school.Production.Production;
import com.school.Custmer.Custmer;
import com.school.Orderlist.Orderlist;
import com.school.Count.Count;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBoperater {
    private static String URL =
            "jdbc:mysql://localhost/sell_system";
    private static String USER = "root";
    private static String PASSWORD = "";

    //获取数据源
    public static DataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }


    //1.产品表的相关操作

    //插入产品
    public static void insert1(Production production){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="insert into production values(?,?,?,?)";
            pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1,production.getPid());
            pstmt.setString(2,production.getName());
            pstmt.setInt(3,production.getPrice());
            pstmt.setInt(4,production.getCount());
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
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

    //修改产品表
    public static void update1(Production p,int pid){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="update production set pname=?,price=?,count=? where pid=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setString(1,p.getName());
            pstmt.setInt(2,p.getPrice());
            pstmt.setInt(3,p.getCount());
            pstmt.setInt(4,pid);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null){
                    pstmt.close();
                }

                if(connection !=  null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //删除产品
    public static void delete1(int pid){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();
            String sql="delete from production where pid=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setInt(1,pid);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }



    //2.客户表的基本操作

    //添加客户
    public static void insert2(Custmer c){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="insert into custmer values(?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);

            pstmt.setInt(1,c.getCid());
            pstmt.setString(2,c.getName());
            pstmt.setString(3,c.getAddress());
            pstmt.setString(4,c.getTelenumber());
            pstmt.setString(5,c.getCredit());
            pstmt.setInt(6,c.getMoney());
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

    //修改客户信息、
    public static void update2(Custmer c,int cid){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="update custmer set cname=?,address=?,telenumber=?,credit=?,money=? where cid=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setString(1,c.getName());
            pstmt.setString(2,c.getAddress());
            pstmt.setString(3,c.getTelenumber());
            pstmt.setString(4,c.getCredit());
            pstmt.setInt(5,c.getMoney());
            pstmt.setInt(6,cid);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //删除客户信息
    public static void delete2(int cid){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="delete from custmer where cid=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setInt(1,cid);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //库存更新函数
    public static void updateproduction(int pid,int count0){
        Connection connection=null;
        PreparedStatement pstmt=null;

        try {
            connection=getDataSource().getConnection();

            String sql="update production set count=count-? where pid=?";
            pstmt=connection.prepareStatement(sql);

            pstmt.setInt(1,count0);
            pstmt.setInt(2,pid);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //顾客下单
    public static void order(Orderlist o){
        Connection connection=null;
        PreparedStatement pstmt=null;
        Date date=new Date();
        try {
            connection=getDataSource().getConnection();

            String sql1="insert into orderlist values(?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);

            pstmt.setInt(1,o.getOid());
            pstmt.setInt(2,o.getItem());
            pstmt.setDate(3,o.getDate());
            pstmt.setInt(4,o.getCount());
            pstmt.setInt(5,o.getCustmerid());
            pstmt.setInt(6,o.getOpid());
            pstmt.execute();
            updateproduction(o.getOpid(),o.getCount());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    //查询订单(根据顾客号)
    public static List select(int custmerid){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        List<Orderlist> list=new ArrayList<>();

        try {
            connection=getDataSource().getConnection();

            String sql="select * from orderlist where custmerid=?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,custmerid);

            rs=pstmt.executeQuery();

            while(rs.next()){
                Orderlist o=new Orderlist();
                o.setOid(rs.getInt("oid"));
                o.setItem(rs.getInt("item"));
                o.setDate(rs.getDate("date"));
                o.setCount(rs.getInt("count"));
                o.setCustmerid(rs.getInt("custmerid"));
                o.setOpid(rs.getInt("opid"));
                list.add(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    //查询库存
    public static Production select2(int pid){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        Production p=new Production();

        try {
            connection=getDataSource().getConnection();

            String sql="select * from production where pid=?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,pid);

            rs=pstmt.executeQuery();

            while(rs.next()){
                p.setPid(rs.getInt("pid"));
                p.setName(rs.getString("pname"));
                p.setPrice(rs.getInt("price"));
                p.setCount(rs.getInt("count"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return p;
    }


    //统计
    public static List Count(int custmerid1){
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        List<Count> list=new ArrayList<>();

        try {
            connection=getDataSource().getConnection();

            String sql="select opid,sum(orderlist.count) as totalnum,sum(orderlist.count)*price as totalprice from orderlist" +
                    "  inner join production where production.pid=orderlist.opid and custmerid=? group by opid;";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,custmerid1);
            rs=pstmt.executeQuery();

            while(rs.next()){
                Count c=new Count();
                c.setOpid(rs.getInt("opid"));
                c.setTotalnum(rs.getInt("totalnum"));
                c.setTotalprice(rs.getInt("totalprice"));
                list.add(c);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstmt != null) {
                    pstmt.close();
                }

                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
