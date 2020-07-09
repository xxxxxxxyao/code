public class ThreadAdvantage {
    private static final long count=1000000000;

    public static void main(String[] args) throws InterruptedException{

        //1.使用并发方式
        concurrency();

        //2.使用串行方式
        serial();

    }


    private static void concurrency() throws InterruptedException{
        //获取当前时间戳,纳秒级别
        long begin=System.nanoTime();

        //利用一个线程计算a的值

        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                int a=0;
                for(long i=0;i<count;i++){
                    a--;
                }

            }
        });
        thread.start();
        System.out.println(Thread.currentThread().isInterrupted());

        //在主线程内计算b
        int b=0;
        for(long i=0;i<count;i++){
            b--;
        }
        //等待thread线程运行结束
        thread.join();

        //统计耗时
        long end=System.nanoTime();
        double ms=(end-begin)*1.0 /1000/1000;
        System.out.printf("并发：%f 毫秒%n",ms);
    }

    private static void serial(){
        //全部在主线程内计算a，b的值
        long begin=System.nanoTime();
        int a=0;
        for(long i=0;i<count;i++){
            a--;
        }
        int b=0;
        for(long i=0;i<count;i++){
            b--;
        }
        long end=System.nanoTime();
        double ms=(end-begin)*1.0 /1000/1000;
        System.out.printf("串行：%f 毫秒%n",ms);
    }
}
