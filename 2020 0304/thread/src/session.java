

//并行串行效率问题


public class session {
   private static final int NUM=20;

   private static void increment(){
       int count=1000000000;
       int r=0;
       for(int i=0;i<count;i++){
           r++;
       }
   }


   //串行，及代码行依次执行
   private static void serial(){
       long start=System.currentTimeMillis();//起始时间
       for(int i=0;i<NUM;i++){
           increment();
       }
       long end=System.currentTimeMillis();//结束时间
       System.out.println("串行执行时间是："+(end-start));
   }


   //并发执行，即有多个线程(有时java语义中，并发和并行表达一个意思)
   private static void parallel(){
       long start=System.currentTimeMillis();
       for(int i=0;i<NUM;i++){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   increment();
               }
           }).start();
       }

       //活跃线程数大于1，就让它让步,就是等待所有线程执行完毕
       while(Thread.activeCount()>1){
           Thread.yield();
       }
       long end=System.currentTimeMillis();
       System.out.println("并行执行时间是："+(end-start));
   }

    public static void main(String[] args){
       serial();
       parallel();
    }
}
