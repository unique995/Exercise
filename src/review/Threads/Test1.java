package review.Threads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.*;

class MyThread implements Callable<String>{
    private int ticket = 10;
    @Override
    public String call() throws Exception {
        while (this.ticket > 0){
            System.out.println("剩余票数："+this.ticket -- );
        }
        return "票卖完了，下次吧..." ;
    }
}
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThread());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
        
    }
}
