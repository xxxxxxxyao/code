
//线程间的通信，面包生产

public class thread{


    //库存面包数量，上限100，下限0
    public static volatile int SUM;   //面包数量



    //默认生产者：面包师傅生产面包，一次可以生产3个面包
    public static class Productor implements Runnable{
        @Override
        public void run() {
            //每个面包师傅生产20次
            try {
                for(int i=0;i<20;i++){
                    synchronized (thread.class){
                        while(SUM+3 > 100){   //库存生产完后大于上限了
                            //释放对象锁，要让其他线程进入同步代码块，当前线程阻塞
                            thread.class.wait();
                        }
                        SUM += 3;
                        Thread.sleep(1000);
                        thread.class.notify();
                        System.out.println(Thread.currentThread().getName()+"生产了，库存为："+SUM);
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    //默认存在消费者，一次可以消费一个面包
    public static class Consumer implements Runnable{
        @Override
        public void run() {
            try {
                while(true){
                    synchronized (thread.class){
                        while(SUM == 0){
                            thread.class.wait();
                        }
                        SUM--;
                        Thread.sleep(1000);
                        //随机通知wait阻塞的线程进行唤醒，可能是生产者也可能唤醒消费者
                        //在同步代码块结束之后才会唤醒（释放对象锁后）
                        //即同步代码块结束之后，wait和synchronized代码行阻塞的都会被唤醒
                        thread.class.notify();
                        System.out.println(Thread.currentThread().getName()+"消费了,库存为："+SUM);
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





    public static void main(String[] args) {
        //启动生产者生产面包
        for(int i=0;i<5;i++){
            new Thread(new Productor(),"面包师傅"+i).start();
        }


        //消费面包
        for(int i=0;i<20;i++){
            new Thread(new Consumer(),"消费者"+i).start();
        }
    }
}

