package LeetCode;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class luoHan {
    static class person{
        private int weight;
        private int height;
        public person(int weight,int height){
            this.height = height;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            person[]array = new person[n];
            for (int i = 0;i < n;i++){
                int index = sc.nextInt();
                array[index-1] = new person(sc.nextInt(),sc.nextInt());
            }
            Arrays.sort(array, new Comparator<person>() {
                @Override
                public int compare(person o1, person o2) {
                    int  result = Integer.compare(o1.height,o2.height);
                    if (result != 0){
                        return result;
                    }else {
                        return Integer.compare(o1.weight,o2.weight);
                    }
                }
            });
            int max = Integer.MIN_VALUE;
            int []dp = new int[n];
            for (int i = 0;i < dp.length;i++){
                dp[i] = 1;
                for (int j = i-1;j >= 0;j--){
                    if((array[i].weight > array[j].weight) || (array[i].weight == array[j].weight && array[i].height == array[j].height)){
                        dp[i] = Math.max(dp[i],dp[j+1]);
                    }
                }
                max = Math.max(dp[i],max);
            }
            System.out.println(max);
        }
    }
}
