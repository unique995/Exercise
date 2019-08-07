import java.util.Scanner;

public class Test {


    public static void isSan(double x1,double y1,double x2,double y2,double x3,double y3){
        double p1 = Math.pow((y2-y1),2);
        double p2 = Math.pow((x2-x1),2);
        double a = p1+p2;
        double a1 = Math.sqrt(a);
        double p3 = Math.pow((y3-y2),2);
        double p4 = Math.pow((x3-x2),2);
        double b = p3+p4;
        double b1 = Math.sqrt(b);
        double p5 = Math.pow((y3-y1),2);
        double p6 = Math.pow((x3-x1),2);
        double c = p5+p6;
        double c1 = Math.sqrt(c);
        if(a1+b1 > c1 || a1+c1 > b1 || b1+c1 > a1){
            System.out.println(a1+b1+c1);
            System.out.println((1/2)*(x3-x1)*(x2-x1));

        }else
            System.out.println("Impossible");
    }
    public static int fun(int n){
        if (n < 2 )
            return n;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            double x1 = scanner.nextDouble();
//            double y1 = scanner.nextDouble();
//            double x2 = scanner.nextDouble();
//            double y2 = scanner.nextDouble();
//            double x3 = scanner.nextDouble();
//            double y3 = scanner.nextDouble();
//            isSan(x1,y1,x2,y2,x3,y3);
//        }
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        Integer num3 = 10;
        int num4 = 10;
        System.out.println(num1 == num2);
        System.out.println(num1 == new Integer(10));
        System.out.println(num1.equals(new Integer(10)));
        System.out.println(num1 == num3);
        System.out.println(num3 == num4);
        System.out.println(num1 == num4);




//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while (sc.hasNext()){
//            for (int i = 0; i < num;i++){
//                int sum = sc.nextInt();
//                int []array = new int[sum];
//                for (int j = 0;j < array.length;j++){
//                    array[j] = sc.nextInt();
//                }
//                if (array.length > 2){
//                    int x ;
//                    for (x = 0;x < array.length-2;){
//                        if (array[x] < array[x+1]+array[x+2]){
//                            x++;
//                        }
//                    }
//                    if (array[x] < array[x+1]+array[0] && array[x+1] < array[0]+array[1]){
//                        System.out.println("YES");
//                    }else {
//                        System.out.println("NO");
//                    }
//
//                }else
//                    System.out.println("NO");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int []arr = new int[num];
//        while (scanner.hasNext()){
//            for (int i = 0;i < num;i++){
//                arr[i] = scanner.nextInt();
//            }
//            for (int x = 0;x < arr.length;x++){
//                for (int y = 1;y < arr.length;y++){
//                    if ((arr[x]+arr[y]) % 2 != 0){
//                        int temp = arr[x];
//                        arr[x] = arr[y];
//                        arr[y] = temp;
//                    }
//                }
//            }
//            for (int j = 0;j < arr.length;j++){
//                System.out.print(arr[j]+" ");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int sum = scanner.nextInt();
//        int [] array = new int[sum];
//        for (int i = 0;i < sum;i++){
//            array[i] = scanner.nextInt();
//        }
//        int num = scanner.nextInt();
//        while (num != 0){
//            for (int j = 0;j < num;j++){
//
//            }
//        }

    }
}
