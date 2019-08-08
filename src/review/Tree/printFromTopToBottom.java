package review.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class printFromTopToBottom {
    Queue<TreeNode> queue = new ArrayDeque<>();
    public ArrayList<Integer> PrintFromToBottom(TreeNode root){
        ArrayList<Integer> array = new ArrayList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            array.add(node.val);
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return array;
    }

}
