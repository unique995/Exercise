package review;


import java.util.concurrent.*;

class CallableDemo implements Callable<String>{
    private int ticket = 20;
    @Override
    public String call() throws Exception {
        for (int i = 0;i < 20;i++){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+"还剩下"+(ticket)--+"票");
            }
        }
        return "票已卖完";
    }
}
public class testThread {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new CallableDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> sumbit = null;
        for (int i = 0;i < 3;i++){
            sumbit = executorService.submit(callable);
        }
        System.out.println(sumbit.get());
        executorService.shutdown();

    }
}
