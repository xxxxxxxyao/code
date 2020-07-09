import java.util.concurrent.*;

/**
 * 定时器
 * 1.在约定好的时间点上执行某个任务
 * 2.设置好间隔时间，间隔时间到后再一次通知
 */


public class MyTimer {

    private BlockingQueue<MyTimerTask> queue=new PriorityBlockingQueue();

    public MyTimer(int count){
        for(int i=0;i<count;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            MyTimerTask task = queue.take();
                            synchronized (queue) {
                                long current = System.currentTimeMillis();
                                if (task.next > current) {
                                    queue.wait( task.next-current );
                                    queue.put(task);
                                } else {
                                    task.task.run();
                                    if (task.period > 0) {
                                        task.next = task.next + task.period;
                                        queue.put(task);
                                    }
                                }
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }


    public void schedule(Runnable task,long delay,long period){
        try {
            queue.put(new MyTimerTask(task,System.currentTimeMillis()+delay,period));
            synchronized (queue){
                queue.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static class MyTimerTask implements Comparable<MyTimerTask>{

        private Runnable task;
        private long next;
        private long period;

        public MyTimerTask(Runnable task,long next,long period){
            this.task=task;
            this.next=next;
            this.period=period;
        }

        @Override
        public int compareTo(MyTimerTask o){
            return Long.compare(next,o.next);
        }
    }


    public static void main(String[] args) {
     new MyTimer(4).schedule(new Runnable() {
         @Override
         public void run() {
             System.out.println("起床啦");
         }
     },3000,1000);
    }
}
