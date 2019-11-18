package com.bit.book;

public class Book {
    public String name;
    public String author;
    public int price;
    public String type;
    public boolean isBorrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;           //作者
        this.price = price;            //价格
        this.type = type;             //书的类型
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed==true) ? ",已经借出":"未借出")+
                //", isBorrowed=" + isBorrowed +
                '}';
    }
}
