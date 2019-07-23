package NewCoder;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        String []array = new String[arr.length];
        for (int i = arr.length-1;i > 0;i--){
            for (int j = 0;j < array.length;j++){
                array[j] = arr[i];
                i--;
                System.out.print(array[j]+" ");
            }
        }
    }
}
