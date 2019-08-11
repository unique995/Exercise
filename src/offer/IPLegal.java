package offer;

import java.util.Scanner;

public class IPLegal {
    public static boolean ipLegal(String strip){
        if (strip.length() == 0)
            return false;
        if (strip.length() < 0 && strip.length() > 15)
            return false;
        if (strip.charAt(0) == '.' || strip.charAt(strip.length()-1) == '.')
            return false;
        String []array = strip.split("\\.");
        if (array.length != 4)
            return false;
        for (int i = 0;i < array.length;i++){
            if (array[i].length() > 1 && array[i].charAt(0) == '0'){
                return false;
            }
            for (int j = 0;j < array[i].length();j++){
                if (array[i].charAt(j) < '0' || array[i].charAt(j) > '9'){
                    return false;
                }
            }
        }
        for (int i = 0;i < array.length;i++){
            int temp = Integer.parseInt(array[i]);
            if (i == 0){
                if (temp < 1 || temp > 255){
                    return false;
                }
            }else {
                if (temp < 0 || temp > 255){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strip = scanner.next();
        boolean ip = ipLegal(strip);
        if (ip == true){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
