import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final int PORT=9000;

    private static final ExecutorService POOL= Executors.newCachedThreadPool();

    public static void main(String[] args)throws IOException {
        ServerSocket server=new ServerSocket(9000);


        while(true){
            //等待客户端连接，阻塞式方法,直到有客户端连接进来
            Socket client=server.accept();
            //有新的客户端连接了，就开启新的任务执行，没有就进行阻塞
            POOL.execute(new Task(client));
        }
    }

    //任务类，放进线程池中
    public static class Task implements Runnable{

        private Socket client;

        public Task(Socket client){
            this.client=client;
        }
        public void run(){
            try {

                //包装，将字节流转换为字符流
                BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out=new PrintWriter(client.getOutputStream(),true);
                String str;
                int i=1;
                while((str=in.readLine()) != null && !str.equals("exit")) {
                    System.out.println(str);

                    //调用PrintWriter的println方法发送内容
                    out.println(i + "好啊！");
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
