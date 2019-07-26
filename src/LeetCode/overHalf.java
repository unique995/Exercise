package LeetCode;

import java.util.Scanner;



public class overHalf {
    public static int MoreThanHalfNum_Solution(int [] array) {
        for (int i = 0;i < array.length;i++){
            int count = 0;
            for (int j = 0;j < array.length;j++){
                if (array[i] == array[j])
                    count++;
            }
            int s = array.length/2;
            if (count >= s){
                return array[i];
                //System.out.println(array[i]);
                //break;
            }
            //System.out.println(0);
        }
        return 0;
    }
    public static void main(String[] args) {
    }
}
