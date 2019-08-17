package offer;

import java.util.Scanner;

public class ThreeBit {
    public static void main(String[] args) {

//        for (int i = 1;i < 200;i++){
//            int count = 0;
//            for (int j = i;j > 0;j--){
//                if (i % j == 0){
//                    count++;
//                }
//            }
//            if (count <= 2){
//                System.out.print(i+" ");
//            }
//        }

//        int i = 0;//保存到百位上的数字
//        int j = 0;//保存到十位上的数字
//        int k = 0;//保存到个位上的数字
//        int t = 0;//保存数字的个数
//        for(i = 1; i <= 4; i++) {
//            for(j = 1; j <= 4; j++) {
//                for(k = 1; k <= 4; k++) {
//                    if(i != j&& j != k && i!= k) {
//                        t += 1;
//                    System.out.println(i*100 + j*10 + k);
//                    }
//                }
//            }
//        }
//        System.out.println("总共能够组成" + t + "个数字！");

        Scanner sc = new Scanner(System.in);
        char []strs = sc.next().toCharArray();
        int count = 0;
        for (int i = 0;i < strs.length;i++){
            char c = strs[i];
            for (int j = i+1;j < strs.length;j++){
                if (c == strs[j]){
                    count++;
                }
                break;
            }
        }


    }
}

