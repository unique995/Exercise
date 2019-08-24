package review.Tree;

/*
给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class levelOrder {
    public static List LevelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (node == null)
            return result;
        queue.add(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size-- > 0){
                Node n = queue.poll();
                list.add(n.val);
                queue.addAll(n.children);
            }
            result.add(list);
        }
        return result;
    }


    public void levelOrder(TreeNode root) {
        if (root == null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode front = queue.poll();
            System.out.println(front.val);
            if (front.left != null){
                queue.add(front.left);
            }
            if (front.right != null){
                queue.add(front.right);
            }
        }
    }
    public static void main(String[] args) {

    }
}
