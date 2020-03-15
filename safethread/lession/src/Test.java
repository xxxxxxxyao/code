public class Test {
    private static int num;

    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (Test.class) {
                        for (int j = 0; j < 10000; j++) {
                            num++;
                        }
                    }
                }
            }).start();
        }

        while(Thread.activeCount()>1){
            Thread.yield();
        }

        System.out.println(num);
    }
}
