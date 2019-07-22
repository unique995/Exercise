package NewCoder;

import java.util.Scanner;

public class turnDay {
    public static int OutDay(int year,int month,int day){
        int []Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year <= 0 || month <= 0|| day <= 0 || month > 12 || day > Day[month-1]){
            return 0;
        }
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            Day[1] = 29;
        }
        int sum = 0;
        for (int i = 0;i < month-1;i++){
            sum += Day[i];
        }
        return sum + day;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        while(sc.hasNext()){
            int year = sc.nextInt() ;
            int month = sc.nextInt() ;
            int day = sc.nextInt() ;
            int Day = OutDay(year, month, day) ;
            System.out.println(Day);
        }
        sc.close();
    }
}
