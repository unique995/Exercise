package review;

import java.util.LinkedList;
import java.util.Queue;

public class queueStack {
    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();
    public void push(int node){
        if (queue1.isEmpty() && queue2.isEmpty()){
            queue1.add(node);
        }
        if (queue2.isEmpty()){
            queue1.add(node);
        }
        if (queue1.isEmpty() ){
            queue2.add(node);
        }
    }
    public Integer pop(){
        if (queue1.isEmpty() && queue2.isEmpty()){
            System.out.println("It is null");
        }
        if (queue1.isEmpty() ){
            while (queue2.size() > 1){
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        if (queue2.isEmpty() ){
            while (queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return (Integer)null;
    }
    public static void main(String[] args) {

    }
}
