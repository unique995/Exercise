package review.StackQueue;

import java.util.Stack;

public class PushPop {
    public static boolean isPopValid(int [] push,int []pop){
        if (push.length == 0 || pop.length == 0 || push.length != pop.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int current:push) {
            stack.push(current);
            while ((!stack.isEmpty()) && (stack.peek() == pop[j])){
                stack.pop();
                j++;
            }
        }
        if (stack.empty()){
            return true;
        }else {
            return false;
        }
    }
}
