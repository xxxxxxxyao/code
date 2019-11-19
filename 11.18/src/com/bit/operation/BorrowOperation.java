package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借阅书籍的名称：");
        String name=scanner.next();
        int i=0;
        //不会从booklist中删除，改变isborrowed的状态
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

        //2.看他是否被借出
        Book book=bookList.getBook(i);
        if(book.isBorrowed){
            System.out.println("已经借出");
        }else{
            book.isBorrowed=true;
            System.out.println("书籍借阅成功！");
        }

    }
}
