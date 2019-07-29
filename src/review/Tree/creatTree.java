package review.Tree;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class creatTree {
    private TreeNode root;
    public creatTree(){
        root = null;
    }
    public static void postOrder(TreeNode node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.val);
        }
    }
    public void reConstructBinaryTree(int [] pre,int [] in) {
        reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int start1,int end1,int [] in,int start2,int end2) {
        if (start1 > end1 || start2 > end2)
            return null;
        int rootNode = pre[start1];
        TreeNode node = new TreeNode(rootNode);
        int index = findIndex(in,rootNode,start2,end2);
        TreeNode left = reConstructBinaryTree(pre,start1+1,start1+index-start2,in,start2,index-1);
        TreeNode right = reConstructBinaryTree(pre,start1+index-start2+1,end1,in,index+1,end2);
        node.left = left;
        node.right = right;
        return node;
    }
    public static int findIndex(int[]arr,int data,int begin,int end){
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == data)
                return i;
        }
        return -1;
    }
}
