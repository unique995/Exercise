package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BFS {
    public static void bfs(){

    }
    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0;i < row;i++){
            for (int j = 0;j < col;j++){
                if (grid[i][j] == 2)
                    queue.add(new int[]{i,j,0});
            }
        }
        int ret = 0;
        int nextP[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }};
        while ( !queue.isEmpty()){
            int [] pre = queue.poll();
            ret = pre[2];
            for (int [] it:nextP) {
                int x = pre[0] + it[0];
                int y = pre[1] + pre[1];
                if (x >= 0 && x < row && y >= 0 && y < col && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    queue.add(new int[]{x, y, pre[2] + 1});
                }
            }

        }
        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                if (grid[i][j] == 1)
                    return -1;
        return ret;
    }
}
