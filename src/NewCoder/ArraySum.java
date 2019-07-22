package NewCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        while (sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0;i < n;i++) {
                String str = sc.next();
                str = str.replace("-", ",");
                String result = "";
                for (int j = 0; j < 7; j++) {
                    result += number.charAt(symbol.indexOf(str.charAt(j) + ""));
                }
                result = result.substring(0, 3) + "-" + result.substring(3, 7);
                if (!list.contains(result)) {
                    list.add(result);
                }
            }
            Collections.sort(list);
            for (int j = 0;j < list.size();j++){
                System.out.println(list.get(j));
            }
            System.out.println();
        }
    }
}
