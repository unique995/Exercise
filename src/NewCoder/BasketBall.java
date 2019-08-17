package NewCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Map<String,Integer> mapA = new HashMap<String, Integer>();
        Map<String,Integer> mapB = new HashMap<String, Integer>();
        for (int i = 0;i < str1.length();i++){
            if (mapA.containsKey(str1.charAt(i)+"")){
                mapA.put(str1.charAt(i)+"",mapA.get(str1.charAt(i)+"")+1);
            }else {
                mapA.put(str1.charAt(i)+"",1);
            }
        }
        for (int i = 0;i < str2.length();i++){
            if (mapB.containsKey(str2.charAt(i)+"")){
                mapB.put(str2.charAt(i)+"",mapB.get(str2.charAt(i)+"")+1);
            }else {
                mapB.put(str2.charAt(i)+"",1);
            }
        }
        int flag = 0;
        for (String key:mapB.keySet()) {
            if (!mapA.containsKey(key)){
                flag = 1;
                break;
            }else {
                if (mapA.get(key) < mapB.get(key)){
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1){
            System.out.println("NO");
        }else {
            System.out.println("Yes");
        }
    }
}
