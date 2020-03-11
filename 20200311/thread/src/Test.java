//线程中断代码

public class Test {

    //中断线程，但是线程没有处理中断，遇到中断时自身自己判断到底要不要中断
    public static void test1() {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){

                }
            }
        });
        //先启动线程之后再做线程的一些方法的调用
        t.start();
        t.interrupt();
    }

    public static void test2(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
               while(!Thread.currentThread().isInterrupted()){
                   System.out.println(Thread.currentThread().getName());
               }
            }
        });
        //先启动线程之后再做线程的一些方法的调用
        t.start();       //此时t线程的中断标志位为false
        t.interrupt();   //此时t线程的中断标志为为true
    }


    //阻塞中的线程被中断请求，就直接抛出异常（如wait，join，sleep等）
    public static void test3(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.sleep(3000);   //线程调用sleep方法进行阻塞,遇到中断请求直接抛出异常，抛出异常之后将中断标志位进行重置
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        //先启动线程之后再做线程的一些方法的调用
        t.start();       //此时t线程的中断标志位为false
        t.interrupt();
    }


    //使用自定义的中断标志位来进行中断，满足不了线程处于阻塞态时自动抛出异常的处理逻辑
    public static volatile boolean is_interrupted;

    public static void test4(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while(!is_interrupted){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        t.start();
        is_interrupted=true;
    }


    public static void main(String[] args) {
        test1();
    }
}


//1.线程启动后，中断标志位=false
//2.在线程运行状态中处理线程中断，需要自行通过判断中断标志位，来进行中断的处理逻辑.
//3.线程因调用wait，join，sleep处于阻塞状态时，将线程中断，会直接抛出异常，抛出异常后中断标志位进行重置
//4.静态interrupted(); 返回中断标志位，并且重置标志位
//实例isinterrupted();返回中断标志位，不进行重置
//5.自定义标志位满足不了线程处于阻塞状态时抛出异常的逻辑处理