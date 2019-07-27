package LeetCode;


/*
给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
你可以假设网格的四个边均被水包围。
 */
class islandNum {
    static int[][] point = {{0,1},{1,0},{0,-1},{-1,0}};
    public void DFS(char[][] grid,int col,int row,int x,int y){
        if(x < 0 || y < 0 || x >= row || y >= col){
            return;
        }
        if(grid[x][y] == '1'){
            for(int i = 0; i < 4; i++){
                int newx = x + point[i][0];
                int newy = y + point[i][1];
                grid[x][y] = 'z';
                DFS(grid, col, row, newx, newy);
            }
        }
    }

    public int numIslands(char[][] grid) {
        if(grid.length == 0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    DFS(grid, col, row, i, j);
                }
            }
        }
        return count;
    }
}
