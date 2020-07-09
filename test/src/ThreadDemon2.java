public class ThreadDemon2 {
    private static class Counter{
        private long n=0;

        public  synchronized void increment(){
            n++;
        }


        public long value(){
            return n;
        }
    }

    public static void main(String[] args) throws InterruptedException{
        final int COUNT=10000;
        Counter counter=new Counter();

        //新建一个线程执行n++操作
        Thread thread=new Thread(()->{
            for(int i=0;i<COUNT;i++){
                counter.increment();
            }
        },"李四");
        thread.start();


        //在main函数里执行n++操作
        for(int i=0;i<COUNT;i++){
            counter.increment();
        }

        //等待thread执行完毕
        thread.join();
        //输出值
        System.out.println(counter.value());
    }
}
