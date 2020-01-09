package com.school.Production;

public class Production {
    private int pid;
    private String name;
    private int price;
    private int count;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Production{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}'+"\n";
    }
}
