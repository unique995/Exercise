package review.Tree;

public class countNodes {
    public int CountNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        int count = 0;
        count++;
        CountNodes(root.left);
        CountNodes(root.right);
        return count;
    }
    public int KNodes(TreeNode root,int k){
        if (root == null){
            return 0;
        }
        if (k == 1){
            return 1;
        }
        int left = KNodes(root.left,k-1);
        int right = KNodes(root.right,k-1);
        return left+right;
    }
}
