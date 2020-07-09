package com.bittech;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        String path="E:\\java-code\\file\\";
        String dir_name="demo_dir\\dir1\\dir2\\demo.java";
        String pathname=path+dir_name;
        File file=new File(pathname);

        File pfile=file.getParentFile();
        if(!pfile.exists()){
            pfile.mkdirs();
        }

        if(!file.exists()){
            file.createNewFile();
        }
    }
}
