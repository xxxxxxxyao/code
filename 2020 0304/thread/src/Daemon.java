
//守护线程

public class Daemon {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(999999999999L);  //阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);   //设置守护线程，直接使阻塞退出
        t.start();
    }
}
