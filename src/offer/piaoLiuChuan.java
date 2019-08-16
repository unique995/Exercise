package offer;

import java.util.Arrays;
import java.util.Scanner;

public class piaoLiuChuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []arr = scanner.nextLine().split(" ");
        int []num = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            num[i] = Integer.valueOf(arr[i]);
        }
        int max = scanner.nextInt();
        Arrays.sort(num);
        int i = 0;
        int j = num.length-1;
        int count = 0;
        while (i < j){
            if (num[i] + num[j] <= max){
                i++;
                j--;
            }else{
                j--;
            }
            count++;
        }
        if (i == j){
            count++;
        }
        System.out.println(count);
    }
}
