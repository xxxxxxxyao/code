public class MyThreadPool {


    private MessageQueue<Runnable> queue;

    public MyThreadPool(int size,int capacity){
        queue=new MessageQueue<>(capacity);

        //在构造方法里直接创建好核心线程数让去阻塞式队列里取任务
        for(int i=0;i<size;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //核心线程数一直在运行
                        while(true) {
                            Runnable task = queue.take();
                            //直接调用实例方法去执行任务
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }


    public void execute(Runnable task){
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadPool pool=new MyThreadPool(5,100);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });
    }
}
