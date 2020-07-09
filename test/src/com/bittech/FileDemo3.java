package com.bittech;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
       File file=new File("E:\\linuxtools");
       File[] result=file.listFiles();
       for(File file1:result){
           System.out.println(file1);
       }

       String s=" trhinef ";
        System.out.println(s);
    }
}
