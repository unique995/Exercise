package NewCoder;

import java.util.Scanner;

public class stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int []arrx = new int[x];
        int []arry = new int[y];
        int num = 0;
        while (sc.hasNextLine()){
            for (int i = 0;i < arrx.length;i++){
                arrx[i] = sc.nextInt();
            }
            for (int j = 0;j < arry.length;j++){
                arry[j] = sc.nextInt();
            }

//            for (int m = 0;m < arrx.length;m++){
//                for (int n = 0;n < arry.length;n++){
//                    if ((arrx[m] + arry[n])%2 == 0){
//                        n++;
//                    }else {
//                        if (arrx[m] == arry[n]){
//                            num++;
//                        }
//                    }
//                }
//                m++;
//            }
            int p = 0,q = 0;
            int count = 0;
            while (p < arrx.length && q < arry.length){
                if (arrx[p] + arry[q] % 2 != 0){
                    count++;
                    p++;
                    q++;
                }else {
                    q++;
                }
            }
            System.out.println(count);
        }

    }
}
