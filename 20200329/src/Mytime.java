import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

//定时器
//1.在约定好的时间点上，执行某个任务
//2.间隔的时间到了，不停的执行任务

public class Mytime {

    //jdk时间操作
    /*public static void main(String[] args) {

        //Date
        Date date1=new Date();    //返回当前系统时间
        Date date2=new Date(9999);  //以格林威治时间1970-01-01开始，经过给定的时间数量的毫秒
        //DateFormat
        DateFormat df=new SimpleDateFormat("1999-02-26 12:23:00");
       // System.out.println(df.format(date1));
       // System.out.println(df.format(date2));
        //System时间获取，从1970-01-01开始到当前时间所经过的毫秒数
        long current=System.currentTimeMillis();


        TimerTask task=new TimerTask(){
            public void run(){
                System.out.println("起床");
            }
        };
        new Timer().schedule(task,3000,1000);
    }*/



    private BlockingQueue<MyTimertask> queue=new PriorityBlockingQueue<>();

    public Mytime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        //blockingqueue本身就是线程安全的，所以这里方法调用不用放在同步代码块中
                        MyTimertask task=queue.take();
                        synchronized (queue){
                            long current=System.currentTimeMillis();
                            if(task.next > current){
                                queue.wait(task.next-current);
                                queue.put(task);
                            }else{
                                task.task.run();
                                if(task.period >0){
                                    task.next=task.next+task.period;
                                    queue.put(task);
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    private static class MyTimertask implements Comparable<MyTimertask> {

        private Runnable task;   //定时任务
        private long next;       //下次执行的时间
        private long period;

        public MyTimertask(Runnable task,long next,long prriod){
            this.task=task;
            this.next=next;
            this.period=period;
        }

        public void run(){

        }

        public int compareTo(MyTimertask o){
            return Long.compare(next,o.next);
        }

    }

    //自己写时间处理业务
    //延迟和间隔
    public void schedule(Runnable task,long delay,long period){
       /* //要new线程性能不好
        try {
            //利用休眠
            Thread.sleep(delay);
            new Thread(task).start();
            while(period>0){
                Thread.sleep(period);
                new Thread(task).start();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        try {
            queue.put(new MyTimertask(task,System.currentTimeMillis()+delay,period));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
