package review.Tree;

public class treeDepth {
    public static int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return false;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.abs(left-right) <= 1;
    }
}
