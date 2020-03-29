
//1.实现阻塞式队列，满足生产者消费者模型
//2.在生产消费达到上限或者下限的时候，不能生产或消费


public class MessageQueue<E> {
    private Object[] items;
    private int takeindex;    //弹出元素的索引
    private int putindex;     //添加元素的索引
    private int size;         //有效容量


    public MessageQueue(int capacity){
        items=new Object[capacity];
    }



    //生产面包
    public synchronized void put(E e) throws InterruptedException{
        while(size == items.length){   //满了
            wait();
        }
        putindex=(putindex+1)%items.length;
        items[putindex]=e;
        size++;
        notifyAll();
    }



    //消费面包
    public synchronized E take() throws InterruptedException{
        while(size==0){    //达到下限等待
            wait();
        }
        takeindex=(takeindex+1)%items.length;
        size--;
        notifyAll();
        return (E)items[takeindex];
    }




    public static void main(String[] args) throws InterruptedException{
        MessageQueue<Integer> queue=new MessageQueue<>(100);
        for(int i=0;i<5;i++) {
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
