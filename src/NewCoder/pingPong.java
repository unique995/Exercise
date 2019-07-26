package NewCoder;

import java.util.Scanner;

public class pingPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            int []arrA = new int[26];
            int []arrB = new int[26];
            for (int i = 0;i < str1.length();i++){
                arrA[str1.charAt(i)-'A']++;
            }
            for (int j = 0;j < str2.length();j++){
                arrB[str2.charAt(j)-'A']++;
            }
            boolean flag = true;
            for (int i = 0;i < 26;i++){
                if (arrA[i] < arrB[i]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
