//线程安全问题

public class unsafe {
    static int x;
    public static  void main(String[] args) {

        //同时启动20个线程，每个线程对同一个变量进行操作：循环10000次，每次对变量进行++
        for(int i=0;i<20;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10000;j++){
                        x++;
                    }
                }
            }).start();
        }

        //让步，等待所有线程执行完毕
        while(Thread.activeCount() > 1){   //用debug运行
            Thread.yield();
        }

        //运行多次，每次出现的结果都不一样且不是期望的结果200000
        System.out.println(x);
    }
}
