package NewCoder;

import java.util.ArrayList;
import java.util.List;

public class printM {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0)
            return list;
        int m = matrix.length;
        int n = matrix[0].length;
        int lay = (Math.min(m,n)-1)/2+1;
        for (int i = 0;i < lay;i++){
            for (int k = i;k < n-i;k++)
                list.add(matrix[i][k]);
            for (int j = i+1;j < m-j;j++)
                list.add(matrix[j][n-i-1]);
            for (int k = n-i-2;(k >= i)&&(m-i-1 != i);k--)
                list.add(matrix[m-i-1][k]);
            for (int j = m-i-2;(j>i)&&(n-i-1 != i);j--)
                list.add(matrix[j][i]);
        }
        return list;
    }
}
