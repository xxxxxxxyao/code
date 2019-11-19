package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要归还书籍的名称：");
        String name=scanner.next();
        int i=0;
        //1.找这本书是否存在
        for ( i = 0; i <bookList.getSize() ; i++) {
            if(bookList.getBook(i).name.equals(name)){
                break;
            }
        }

        if(i>=bookList.getSize()){
            System.out.println("没有此书");
            return;
        }

        Book book=bookList.getBook(i);
        if(book.isBorrowed){
            book.isBorrowed=false;
            System.out.println("书籍归还成功！");
        }else{
            System.out.println("书籍归还失败！");
        }
    }
}
