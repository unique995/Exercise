package review;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class goods{
    private String name;
    private int count = 0;
    private int maxCount;
    public goods(int maxCount){
        this.maxCount = maxCount;
    }
    private Lock lock = new ReentrantLock();
    private Condition producer = lock.newCondition();
    private Condition consumer = lock.newCondition();
    public void Produce(String name){
        try {
            lock.lock();
            while (this.count == maxCount){
                System.out.println("商品数量已经达最大，等待消费者消费");
                producer.await();
            }
            this.name = name;
            System.out.println(Thread.currentThread().getName()+"生产"+(count++)+"商品");
            consumer.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void Consume(){
        try {
            lock.lock();
            while (this.count == 0){
                System.out.println("商品已经被消费完，等待生产");
                consumer.await();
            }
            System.out.println(Thread.currentThread().getName()+"消费"+(count--)+"商品");
            producer.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "goods{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
class Producer implements Runnable{
    private goods good;
    public Producer(goods good){
        this.good = good;
    }
    @Override
    public void run() {
        while (true){
            this.good.Produce("anmuxi");
        }
    }
}
class Consumer implements Runnable{
    private goods good;
    public Consumer(goods good){
        this.good = good;
    }
    @Override
    public void run() {
       while (true){
            this.good.Consume();
        }
    }
}
public class produceConsum {
    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();
        goods good = new goods(10);
        Producer producer = new Producer(good);
        Consumer consumer = new Consumer(good);

        for (int i = 0;i < 2;i++){
            Thread thread = new Thread(producer,"生产"+i);
            list.add(thread);
        }
        for (int i = 0;i < 4;i++){
            Thread thread = new Thread(consumer,"消费"+i);
            list.add(thread);
        }
        for (Thread t:list) {
            t.start();
        }
    }
}
