public class ThreadDemo {
    private static class MyRunnable implements Runnable{
        @Override
        public void run(){
            if(!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+"正在转账！");


                    //Thread.sleep(1000);
                    System.out.println(11);

            }else
            System.out.println(Thread.currentThread().getName()+"还好停止了！");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        MyRunnable target=new MyRunnable();
        Thread thread=new Thread(target,"李四");
        System.out.println(Thread.currentThread().getName()+"让李四开始转账");
        thread.start();
        //Thread.sleep(10*1000);
        System.out.println(Thread.currentThread().getName()+"要求停止转账");
        thread.interrupt();
    }
}
