import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService pool= new ThreadPoolExecutor(
                3,        //核心线程数(正式线程数)
                5,    //最大线程数(正式工+临时工来完成任务：临时工是任务比价多，正式工忙碌不过来才会去雇佣临时工)
                30,      //时间数量(若任务比较少，临时工距离上次工作之后处于空闲的时间达到给定的时间范围，就将临时工‘解雇掉’)
                TimeUnit.SECONDS,     //时间单位


                //阻塞式队列，存放任务的结构体(如果阻塞式队列任务已经放满，还要往线程里放任务，线程池提供多种策略)
                new ArrayBlockingQueue<>(1000),


                //线程池创建Thread线程的工厂类，没有提供，就使用线程池内部默认的创建线程的方法
                new ThreadFactory(){
                    @Override
                    public Thread newThread(Runnable r){
                        return null;
                    }
                },

                //拒绝策略
                //1.CallerRunsPolicy()：线程池已经满了，已经不接受任务，任务由自己完成
                //2.AbortPolicy()：线程池已满，再调用就直接抛出异常
                //3.DiscardPolicy()：从阻塞式队列抛弃最新的任务（队尾）
                //4.DiscardOldestPolicy():从阻塞式队列丢弃最旧的任务(队头)
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        pool.execute(new Runnable() {
            @Override
            public void run() {
                //任务代码，线程池里的线程就可以直接运行任务代码
                System.out.println("送快递");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("倒杯水");
            }
        });
        System.out.println("正在忙");

    }
}
