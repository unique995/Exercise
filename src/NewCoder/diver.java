package NewCoder;

import java.util.Arrays;
import java.util.Scanner;

public class diver {
    public int divide(int dividend, int divisor) {

        if (divisor == 0){
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean flag;
        flag = (dividend ^ divisor) < 0;
        long d1 = Math.abs((long) dividend);
        long d2 = Math.abs((long) divisor);
        int count = 0;
        for (int i = 31;i >= 0;i--){
            if ((d1 >> i) >= d2){
                count += 1;
                d1 -= d2 << i;
            }
        }
        return flag ? -count : count;
    }

    public static int Num(int x){
        if (x == 0){
            return 0;
        }
        if (x == 1 ){
            return 1;
        }
        if (x == 2){
            return 1;
        }
        return Num(x-1)+Num(x-2);
    }
    public static int Num1(int x){
        int a = 1;
        int b = 1;
        int result = 0;
        if (x > 2){
            for (int i = 3;i <= x;i++){
                result = a + b;
                a = b;
                b = result;
            }
        }else if (x == 0){
            return 0;
        }else {
            return 1;
        }
        return result;
    }
    static int schedule(int m,int[] array) {
        int []min = new int[m];
        int x = 0;
            for (int j = 0;j < array.length;j++){
                if (m < array.length-j){
                    min[x] = array[j]+array[j+1];
                    m--;
                }else
                    min[x++] = array[j];
            }
        Arrays.sort(min);
        return min[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Num1(x));
    }
}
