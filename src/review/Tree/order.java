package review.Tree;

import java.util.Stack;

public class order {
    public static void PreOrder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = node;
        while (p != null || !stack.isEmpty()){
            while (p != null){
                System.out.println(p.val);
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop();
                p = p.right;
            }
        }
    }
    public static void InOrder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = node;
       while (p != null || !stack.isEmpty()){
           while (p != null){
               stack.push(p);
               p = p.left;
           }
           if (! stack.isEmpty()){
               p = stack.pop();
               System.out.println(p.val);
               p = p.right;
           }
       }
    }
}
