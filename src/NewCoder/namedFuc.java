package NewCoder;

import java.util.Scanner;

public class namedFuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String []arr = str1.split("_");
            String result  = arr[0];
            for (int i = 1;i < arr.length;i++){
                result += arr[i].charAt(0)-'a'+'A';
                for (int j = 1;j < arr[i].length();j++){
                    result += arr[i].charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
