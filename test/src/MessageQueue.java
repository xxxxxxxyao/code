//1.实现阻塞式队列，满足生产者消费者模型
//2.在生产消费达到上限或者下限的时候，不能生产或消费


public class MessageQueue<E> {
    private Object[] items;     //存放商品的数组
    private int takeIndex;      //弹出索引
    private int putIndex;       //存放添加商品的索引
    private int size;           //有效元素个数

    public MessageQueue(int capacity){
       items=new Object[capacity];
    }



    //做添加操作
    public synchronized void put(E e) throws InterruptedException{
        while(size==items.length){         //达到上限，需要等待
            wait();
        }
        items[putIndex]=e;
        putIndex=(putIndex+1)%items.length;
        size++;
        notifyAll();
    }


    //做弹出操作
    public synchronized E take() throws InterruptedException{
        while(size==0){              //达到下限，需要等待
            wait();
        }
        size--;
        notifyAll();
        E e=(E) items[takeIndex];
        takeIndex=(takeIndex+1)%items.length;
        return e;
    }


    public static void main(String[] args) throws InterruptedException{
        MessageQueue<Integer> queue=new MessageQueue<>(100);
        for(int i=0;i<5;i++){
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for(int j=0;j<100;j++){
                            queue.put(k*100+j);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        while(true){
            int num=queue.take();
            System.out.println(num);
        }
    }
}
