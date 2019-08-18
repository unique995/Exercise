package review.Tree;

public class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(int data){
        this.data = data;
        left = null;
        right = null;
    }
    public static void insert(BinaryTree root,int data){
        if (data > root.data ){
            if (root.right == null){
                root.right = new BinaryTree(data);
            }else {
                insert(root.right,data);
            }
        }else {
            if (root.left == null){
                root.left = new BinaryTree(data);
            }else{
                insert(root.left,data);
            }
        }
    }
    public static void inOrder(BinaryTree root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,3};
        BinaryTree root = new BinaryTree(arr[0]);
        for (int i = 1;i < arr.length;i++){
            root.insert(root,arr[i]);
        }
        root.inOrder(root);
    }
}
