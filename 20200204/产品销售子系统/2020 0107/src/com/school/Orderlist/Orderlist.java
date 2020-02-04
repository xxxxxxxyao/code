package com.school.Orderlist;

import java.sql.Timestamp;

public class Orderlist {
    private int oid;
    private int item;
    private Timestamp date;
    private int count;
    private int custmerid;
    private int opid;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCustmerid() {
        return custmerid;
    }

    public void setCustmerid(int custmerid) {
        this.custmerid = custmerid;
    }

    public int getOpid() {
        return opid;
    }

    public void setOpid(int opid) {
        this.opid = opid;
    }

    @Override
    public String toString() {
        return "custmerid="+custmerid+"  "+"oid="+oid+"  "+"item="+item+"  "+"date="+date+"  "+"count="+count+"  "+"opid="+opid+"  "+"\n";
    }
}
