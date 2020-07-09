package com.bittech;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException{
        String path="E:\\java-code\\file\\";
        String name="demo1.txt";
        String pathname=path+name;
        File file=new File(pathname);
        System.out.println(File.separator);


        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                System.out.println("文件创建失败！");
            }
        }else{
            System.out.println("文件已经存在！");
        }
    }
}

class Singleton{
    private  static volatile Singleton instance=null;
    private Singleton(){};
    public static Singleton getinstance(){
       if(instance==null){
           synchronized (Singleton.class){
               if(instance==null){
                   instance=new Singleton();
               }
           }
       }
       return instance;
    }
}
