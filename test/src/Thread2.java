public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable target=()->{
            for(int i=0;i<5;i++){
                try{
                    System.out.println(Thread.currentThread().getName()+"正在工作");
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"工作结束！");
        };

        Thread thread1=new Thread(target,"李四");
        Thread thread2=new Thread(target,"张三");
        

        System.out.println("李四开始工作");
       // Thread.start();
        //Thread.join();
        System.out.println("张三开始工作");
        thread2.wait();
        thread1.sleep(1000);
        //thread2.join();
        System.out.println("全部工作结束！");


    }
}
