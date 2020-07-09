package com.bit;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferRate {
    public static void main(String[] args) throws IOException {
        File file=new File("bit.txt");

        //缓冲流
        BufferedInputStream bfis=new BufferedInputStream(new FileInputStream(file));
        int tmp=0;
        long time=System.currentTimeMillis();
        while((tmp=bfis.read())!=-1){
            //System.out.println((char)tmp);
        }
        time=System.currentTimeMillis()-time;
        bfis.close();
        System.out.println("缓冲流读取："+time+"ms");


        //非缓冲流
        FileInputStream fin=new FileInputStream(file);
        int tmp1=0;
        time=System.currentTimeMillis();
        while((tmp1=fin.read())!=-1){
            //System.out.println((char)tmp1);
        }
        time=System.currentTimeMillis()-time;
        fin.close();
        System.out.println("非缓冲流读取："+time+"ms");
    }
}
