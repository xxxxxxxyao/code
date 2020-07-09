package com.bit;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("E:\\icons\\icons\\bit.txt");
        BufferedReader breader=new BufferedReader(reader);

        FileWriter writer=new FileWriter("E:\\icons\\bit1.txt");
        BufferedWriter bwriter=new BufferedWriter(writer);

        String content="";
        while((content=breader.readLine())!=null){
            bwriter.write(content);
        }


        breader.close();
        reader.close();
        bwriter.close();
        writer.close();
    }
}
