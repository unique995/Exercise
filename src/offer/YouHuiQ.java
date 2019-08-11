package offer;

import java.util.Scanner;

public class YouHuiQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'a' || chars[i] < 'z' || chars[i] > 'A' || chars[i] > 'Z' ||
                    chars[i] == '[' || chars[i] == ']' ||
                    chars[i] == ',' || chars[i] == '_' || chars[i] == '^' || chars[i] == '\\') {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
