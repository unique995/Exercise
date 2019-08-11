package offer;

import java.util.Scanner;

/*
有一个X*Y的网格，小团要在此网格上从左上角到右下角，
只能走格点且只能向右或向下走。
请设计一个算法，计算小团有多少种走法。
给定两个正整数int x,int y，请返回小团的走法数目。
 */
public class WangGe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int [][]array = new int[11][11];
        array[0][0] = 0;
        for (int i = 0;i <= x;i++){
            array[i][0] = 1;
        }
        for (int i = 0;i <= y;i++){
            array[0][i] = 1;
        }
        for (int i = 1;i <= x;i++){
            for (int j = 1;j <= y;j++){
                array[i][j] = array[i-1][j]+array[i][j-1];
            }
        }
        System.out.println(array[x][y]);
    }
}
