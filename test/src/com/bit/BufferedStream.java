package com.bit;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        File file=new File("bit.txt");
        if(!file.isFile()){
            return;
        }

        BufferedInputStream bfis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bfos=new BufferedOutputStream(new FileOutputStream("src\\"+file.getName()));

        byte[] bytes=new byte[1024];
        int tmp=0;

        while((tmp=bfis.read(bytes))!=-1){
            bfos.write(bytes,0,tmp);
        }
        bfos.flush();
        bfos.close();
        bfis.close();
        System.out.println("copy成功！");
    }
}
