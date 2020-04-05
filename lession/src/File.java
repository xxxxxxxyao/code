import java.io.*;


import org.junit.Test;

public class File{

    //字节流转换为字符流，需要使用字节字符转换流
    //使用InoutStreamReader：可以使字节字符转换

    @Test
   public void fileRead_1() throws IOException {
       FileInputStream fis=new FileInputStream(new java.io.File("D:\\Git\\64code\\res/info.txt"));
       BufferedReader br=new BufferedReader(new InputStreamReader(fis));
       /*String line;
       while((line=br.readLine())!=null){
           System.out.println(line);
       }*/


       char[] c=new char[1024];
       int i;
       while((i=br.read(c,0,7))!=-1){
           String s=new String(c,0,i);
           System.out.println(s);
       }
   }

   @Test
   public void testWrite() throws IOException{
        //文件不存在也会生成
        FileOutputStream fis=new FileOutputStream(new java.io.File("D:\\Git\\64code\\res/info.txt"));
        //使用缓冲流，输出的时候，要进行flush刷新缓冲区，否则不会真实输出数据到目的设备
        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(fis));
        br.write("1.hudhui");
        br.write("2.djehfv");   //写到系统内存中
        br.flush();       //缓冲区刷新，发送数据到目的设备

   }

   @Test
   //文件复制的操作
    public void copy() throws IOException{
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        try {
            fis = new FileInputStream(new java.io.File("D:\\Git\\64code\\res/info.txt"));
            bis = new BufferedInputStream(fis);

             fos = new FileOutputStream(new java.io.File("D:\\Git\\64code\\res/info1.txt"));
            //使用缓冲流，输出的时候，要进行flush刷新缓冲区，否则不会真实输出数据到目的设备
             bos = new BufferedOutputStream(fos);


            byte[] c = new byte[1024*8];
            int i;
            while ((i = fis.read(c)) != -1) {
                bos.write(c);
                bos.flush();
            }
        }finally{
            //注意释放资源的顺序，根据依赖关系反向释放
            if(bis!=null){
                bis.close();
            }
            if(fis!=null){
                fis.close();
            }
            if(bos!=null){
                bos.close();
            }
            if(fos!=null){
                fos.close();
            }
        }
   }
}