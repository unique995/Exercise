package NewCoder;


//求解连续子数组的最大和比如：{1,4,-10,9,2,-1}。连续子数组最大和为：11。

import java.util.Scanner;

public class ArraySum {
    public static int maxArr(int n,int []arr){
        if (arr == null || n <= 0){
            return -1;
        }
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            if (sum <= 0){
                sum = arr[i];
            }else {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int []num = new int[n];
            for (int i = 0;i < num.length;i++){
                num[i] = sc.nextInt();
            }
            int result = maxArr(n,num);
            System.out.println(result);
        }

    }
}
