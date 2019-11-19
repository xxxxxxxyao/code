package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要删除书籍的名称：");
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

        //开始删除
       int pos=i;
        for (int j = pos; j < bookList.getSize()-1; j++) {
            Book nextbook=bookList.getBook(j+1);
            bookList.setBooks(j,nextbook);
        }

        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功！");
    }
}
