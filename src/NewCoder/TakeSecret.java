package NewCoder;

import java.util.Scanner;

public class TakeSecret {
    public static char enCrypt(char c){
        if (c >= 'a' && c <= 'z'){
            return  (char) (c + 1 - 32);
        }else if (c > 'A' && c < 'Z'){
            return (char) (c + 1 + 32);
        }else if ( c == 'z'){
            return 'A';
        }else if (c  == 'Z'){
            return 'a';
        }else if (c >= '0' && c <= '9'){
            return (char)(c+1);
        }else if (c == '9'){
            return '0';
        } else{
            return c;
        }
    }
    public static String Encrypt(String string){
        char []str = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < str.length;i++){
            sb.append(enCrypt(str[i]));
        }
        return sb.toString();
    }
    public static char unEncrypt(char c){
        if( c > 'a' && c <= 'z'){
            return (char) (c - 1 -32);
        }else if (c > 'A' && c <= 'Z'){
            return (char) (c - 1 + 32);
        }else if ( c == 'A'){
            return 'z';
        }else if (c  == 'a'){
            return 'Z';
        }else if (c >= '0' && c <= '9'){
            return (char)(c-1);
        }else if (c == '0'){
            return '9';
        } else{
            return c;
        }
    }
    public static String UnEncrypt(String string){
        char []str = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < str.length;i++){
            sb.append(unEncrypt(str[i]));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string1 = sc.nextLine();
            String string2 = sc.nextLine();
            System.out.println(Encrypt(string1));
            System.out.println(UnEncrypt(string2));
        }

    }
}
