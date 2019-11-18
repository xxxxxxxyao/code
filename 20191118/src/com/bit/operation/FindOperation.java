package com.bit.operation;

import com.bit.book.BookList;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要查找书籍的名称：");
        String name=scanner.next();
        int i=0;
        //1.找这本书是否存在
        for ( i = 0; i <bookList.getSize() ; i++) {
            if(bookList.getBook(i).name.equals(name)){
                System.out.println(bookList.getBook(i));
                break;
            }
        }

        if(i>=bookList.getSize()){
            System.out.println("没有此书");
            return;
        }
        System.out.println("书籍查找成功！");
    }
}
