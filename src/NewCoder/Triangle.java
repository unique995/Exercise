package NewCoder;

import java.util.ArrayList;

public class Triangle {
    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int [][]min_sum = new int[triangle.size()][triangle.size()];
        if (triangle.size() == 0)
            return 0;
        int line = triangle.size();
        for (int i = 1;i < line;i++){
            for (int j = 0;j <= i;j++){
                if (j == 0) {
                    min_sum[i][j] = min_sum[i - 1][j];
                }else if (i == j){
                    min_sum[i][j] = min_sum[i-1][j-1];
                }else {
                    min_sum[i][j] = Math.min(min_sum[i-1][j-1],min_sum[i-1][j]);
                }
                min_sum[i][j] = min_sum[i][j] + triangle.get(i).get(j);
            }
        }
        int result  = min_sum[line-1][0];
        for (int i = 1;i < line;i++){
            result = Math.min(min_sum[line-1][i],result);
        }
        return result;
    }
}
