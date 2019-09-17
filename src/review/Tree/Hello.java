package review.Tree;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Hello {
    public static int Func(int []arr){
        int num = 0;
        for (int i = 0;i < arr.length;i++){
            int count = 0;
            int flag = 0;
            int max = 0;
            for (int j = i+1;j+1 < arr.length;j++){
                if (flag == 0 && arr[i] > arr[j]){
                    count++;
                }
                if (arr[j]<arr[j+1]){
                    count++;
                    j = j+1;
                }else {
                    flag = 1;
                }
            }
            if (count > max){
                num = arr[i];
            }
        }
        return num;
    }
    public static int fun(int []arr){
        int max = 0;
        int count[] = new int[arr.length];
        count[0] = 0;
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > arr[i-1] && count[i-1] == 0){
                for (int j = 0;j < i;j++){
                    if (count[j] != 0 || arr[j] > arr[i]){
                        count[i] = 0;
                        if (arr[j] < arr[i]){
                            count[i]++;
                        }
                    }else if (arr[j] < arr[i]){
                        count[i]++;
                    }
                }
            }else if (arr[i] > arr[i-1] && count[i-1] != 0){
                count[i] = 1;
            }else {
                count[i] = 0;
            }
            if (count[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void Replace(String str1,String str2){
        String str = "["+str2+"]";

        str1 = str1.replaceAll(str,"");

        System.out.println(str1);
    }
    public static long Sum(long x,long y){
        return x+y;
    }
    public static void Tar(String str){
        if (str == null){
            return ;
        }else {
            char c = str.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1;i < str.length();i++){
                if (c == str.charAt(i)){
                    count++;
                }else {
                    sb.append(count).append(c);
                    c = str.charAt(i);
                    count = 1;
                }
            }
            sb.append(count).append(c);
            System.out.println(sb.toString());
        }
//        char[]arr = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        int temp = 0;
//        for (int i = 0;i < arr.length;i+=temp){
//            int count = 1;
//            for (int j = i+1;j < arr.length;j++){
//                if (arr[i] == arr[j]){
//                    count++;
//                    temp = count;
//                }else{
//                    break;
//                }
//            }
//            sb.append(count).append(arr[i]);
//        }
        //return sb.toString();
    }
    public static void statisticSubStr(String s){
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        int temp = 0;
        for (int i = 0;i < arr.length;i+=temp){
            int count = 1;
            for (int j = i+1;j < arr.length;j++){
                if (arr[i] == arr[j]){
                    count++;
                    temp = count;
                }else {
                    break;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
    public static int getLen(String str){
        if (str == null || str.length() == 0){
            return 0;
        }
        for (int i = str.length();i >= 0;i--){
            for (int j = 0;j+i <= str.length();j++){
                if (str.substring(j,j+i).equals(new StringBuffer(str.substring(j,j+i)).reverse().toString()));
                return i;
            }
        }
        return 0;
    }
    public static int JH(int n,int m){
        int p = 0;
        for (int i = 2;i <= n;i++){
            p = (p+m)%i;
        }
        return p+1;
    }
    public static int CountWays(int m,int n){
        int [][]arr = new int[m][n];
        for (int i = 0;i < m;i++){
            arr[i][0] = 1;
        }
        for (int j = 0;j < n;j++){
            arr[0][j] = 1;
        }
        for (int i = 1;i < arr.length;i++){
            for (int j = 1;j < arr[0].length;j++){
               arr[i][j] = arr[i][j-1]+arr[i-1][j];
            }
        }
        return arr[m-1][n-1];
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count = 0;
//        while (num != 0){
//            if ((num & 1) == 1){
//                count++;
//            }
//            num = num >> 1;
//        }
//        System.out.println(count);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        CountWays( m, n);
        System.out.println(CountWays(m,n));
    }
}
