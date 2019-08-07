package review.StackQueue;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    public void push (int data){
       if ( !minstack.isEmpty() && minstack.peek() < data){
           minstack.push(minstack.peek());
       }else {
           minstack.push(data);
       }
        stack1.push(data);
    }
    public void pop(){
        stack1.pop();
        minstack.pop();
    }
    public int top(){
        return stack1.peek();
    }
    public int min(){
        return minstack.peek();
    }
}
