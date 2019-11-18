package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

public abstract class User {
    public String name;
    protected IOperation[] operations;

    public abstract int menu();    //抽象菜单

    //根据用户的选项执行操作
    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
}
