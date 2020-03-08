

//开启线程和不开启线程的run方法的区别
public class Main{
     public static void main(String[] args) {

         Mythread mythread=new Mythread();
         mythread.start();  //启动线程之后才去调用run方法

         //mythread.run(); //调用一个方法，没有启动线程

         //new Mythread().start();   //直接.start()启动
         //new Thread(new Myrun()).start();  //要传Runnable实例进去

     }
}


class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


class Myrun implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}