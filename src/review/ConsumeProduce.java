package review;


import java.util.ArrayList;
import java.util.List;

class Goods{
    private String name;
    private int count = 0;
    public synchronized void Produce(String name) throws InterruptedException {
       while (this.count > 0){
           wait();
       }
        System.out.println(Thread.currentThread().getName()+"生产"+(this.count+1)+"商品");
        notifyAll();
    }
    public synchronized void Consume() throws InterruptedException {
        while (this.count == 0){
            wait();
        }
        System.out.println(Thread.currentThread().getName()+"消费"+(this.count-1)+"商品");
        notifyAll();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
class produce implements Runnable{
    private Goods goods;
    public produce(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        while (true){
            try {
                this.goods.Produce("anmuxi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class consume implements Runnable{
    private Goods goods;
    public consume(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        while (true){
            try {
                this.goods.Consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ConsumeProduce {
    public static void main(String[] args) {
        Goods goods = new Goods();
        List<Thread> list = new ArrayList<>();
        for (int i = 0;i < 5;i++){
            Thread thread = new Thread(new produce(goods),"生产"+i);
            list.add(thread);
        }
        for (int i = 0;i < 3;i++){
            Thread thread = new Thread(new consume(goods),"消费"+i);
            list.add(thread);
        }
        for (Thread t:list) {
            t.start();
        }
    }
}
