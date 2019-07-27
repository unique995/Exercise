package NewCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class brotherWord {
    public static int check(String key,String word,char[]c){
        if (key.equals(word) || key.length() != word.length()){
            return 0;
        }
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(c,wordChar) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String []array = new String[n];
        for (int i = 0;i < n;i++){
            array[i] = scanner.next();
        }
        String str = scanner.next();
        char []c = str.toCharArray();
        Arrays.sort(c);
        int count = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int num = 0;
        for (int i = 0;i < n;i++){
            int q = check(str,array[i],c);
            num += q;
            if (q == 1){
                list.add(array[i]);
            }
            System.out.println(num);
            Collections.sort(list);
            if (num >= count){
                System.out.println(list.get(count-1));
            }
        }
    }
}
