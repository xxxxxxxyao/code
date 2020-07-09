public class MyThread {
    public static void main(String[] args) {
        //使用匿名类创建Thread子类对象
        Thread t1=new Thread(){
            @Override
            public void run(){
                //do something
            }
        };
        t1.start();


        //使用匿名类创建Runnable子类对象
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                //do something
            }
        });
        t2.start();

        //使用lambda表达式
        Thread t3=new Thread(() -> System.out.println("do something"));
        t3.start();


        System.out.println(Thread.currentThread().getName());

    }
}