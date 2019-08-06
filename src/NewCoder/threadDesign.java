package NewCoder;

public class threadDesign {
    private synchronized void inc(){
        j++;
    }
    private synchronized void des(){
        j--;
    }
    class Inc implements Runnable{
        @Override
        public void run() {
            for (int i = 0;i < 10;i++){
                inc();
            }
        }
    }
    class Dec implements Runnable{
        @Override
        public void run() {
            des();
        }
    }
    public  int j = 0;
    public static void main(String[] args) {
        threadDesign t = new threadDesign();
        Inc inc = t.new Inc();
        Dec dec = t.new Dec();
        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(dec);
        Thread t3 = new Thread(inc);
        Thread t4 = new Thread(dec);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
