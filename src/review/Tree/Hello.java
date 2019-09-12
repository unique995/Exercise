package review.Tree;


import java.math.BigInteger;
import java.util.Arrays;
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
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int []arr = new int[len];
////        for (int i = 0;i < len;i++){
////            arr[i] = sc.nextInt();
////        }
//        for (int i = arr.length-1;i >= 0;i--){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(fun(arr));
//    }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        statisticSubStr(str);
    //System.out.println(Tar(str));
    //Tar(str);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        Replace(str1,str2);
//    while (sc.hasNext()){
//        int num = sc.nextInt();
//    }
}
}
