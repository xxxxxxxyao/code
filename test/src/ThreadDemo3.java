public class ThreadDemo3 {
    public static Object object=new Object();

    public static void main(String[] args) throws InterruptedException{



        Thread t=new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (object){
                    try {
                        System.out.println("等待中.....");
                        object.wait();
                        System.out.println("等待时间到");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        t.start();
        
        synchronized (object){
           object.notify();
        }
        System.out.println("main方法结束");
    }
}