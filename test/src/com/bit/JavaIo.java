package com.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIo {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("E:\\icons\\icons\\wode1.png");
        FileOutputStream fout=new FileOutputStream("E:\\icons\\wode1.png");

        int len=0;
        byte[] buff=new byte[1024];
        //从此输入流中将最多buff.length个字节的数据读入一个buff字节数组中
        while((len=fin.read(buff))!=-1){
            fout.write(buff,0,len);   //将指定字节数组buff中从偏移量0开始的len个字节写入此文件输出流
        }

        //关闭流
        fin.close();
        fout.close();
    }
}
