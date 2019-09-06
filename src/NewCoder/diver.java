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
    public static void Run(int M,int S,int T){
        int len = 0;
        int time = 0;
        if (S == 0){
            System.out.println("Yes");
            System.out.println(0);
        }else if (T == 0){
            System.out.println("No");
            System.out.println(0);
        }
        while(len < S && time < T){
            if (M >= 10){
                len += 50;
                time++;
                M -= 10;
            }else if (M >= 6 && T-time >= 2 && S - len > 26){
                len += 50;
                time += 2;
                M -= 6;
            }else if (M >= 2 && T-time >= 3 && S - len > 39){
                len  += 60;
                time += 3;
                M -= 2;
            }else if (T-time >= 7 && S - len >= 100){
                len += 120;
                time += 7;
            }else {
                int a = T-time;
                int b = (S-len+16)/13;
                int c = a < b ?a : b;
                len += c *13;
                time += c;
            }
        }
        if (len >= S){
            System.out.println("Yes");
            System.out.println(time);
        }else {
            System.out.println("No");
            System.out.println(len);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(Num1(x));
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int S = sc.nextInt();
        int T = sc.nextInt();
        Run(M,S,T);
    }
}
