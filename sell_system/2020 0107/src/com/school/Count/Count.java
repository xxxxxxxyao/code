package com.school.Count;

public class Count {
    private int opid;
    private int totalnum;
    private int totalprice;

    public int getOpid() {
        return opid;
    }

    public void setOpid(int opid) {
        this.opid = opid;
    }

    public int getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(int totalnum) {
        this.totalnum = totalnum;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Count{" +
                "opid=" + opid +
                ", totalnum=" + totalnum +
                ", totalprice=" + totalprice +
                '}'+"\n";
    }
}
