package review.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levalOrder {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        queue.add(root);
        while (queue.size() > 0){
            TreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
