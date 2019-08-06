package offer;


/*
二维数组的查找
二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上 到下递增的顺序排序
输入一个二维数组和一个整数， 判断数组中是否含有该整数。
 */
public class findArray {
    public static boolean Find(int[][] arr,int k){
        int row = 0;
        int col = arr[0].length-1;
        while (row < arr.length && col >= 0){
            if (arr[row][col] > k){
                col--;
            }else if (arr[row][col] < k){
                row++;
            }else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 10; i++) {
            System.out.println(Find(a, i));
        }
    }
}
