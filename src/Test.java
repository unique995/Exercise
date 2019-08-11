import java.util.Scanner;

public class Test {
    public static Test t1=new Test();
    {
        System.out.println("blockA");
    }
    static{
        System.out.println("blockB");
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n >= 0 && n <= 10000){
//            int [] arr = new int[n];
//            while (scanner.hasNext()){
//                for (int i = 0;i < arr.length;i++){
//                    arr[i] = scanner.nextInt();
//                }
//                int count = 0;
//                for (int i = 0;i < arr.length-1;i++){
//                        for (int j = i + 1; j < arr.length-1 ; j++) {
//                            if (arr[i] + arr[j] == n)
//                                count++;
//                            break;
//                        }
//
//                }
//                System.out.println(count);
//
//
//            }
//        }





//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n >2 && n <= 100){
//            int []arr = new int[n];
//            while (scanner.hasNext()){
//                for (int i = 0;i < arr.length;i++){
//                    arr[i] = scanner.nextInt();
//                }
//                int i = 0;
//                int j = 0;
//                int []num = new int[2];
//                for (i = 1;i < arr.length;i++){
//                    int min = Math.abs((arr[i]-arr[i-1]));
//                    for (j = 1;j < arr.length;j++){
//                        if (Math.abs((arr[j]-arr[j-1])) < min){
//                            min = Math.abs((arr[j]-arr[j-1]));
//                            num[0] = arr[j-1];
//                            num[1] = arr[j];
//                        }
//                    }
//                    System.out.println(num[0]+" "+num[1]);
//                    break;
//                }
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (N >= 2 && N <= 50000){
//            int []arr = new int[N];
//            while (scanner.hasNextLine()){
//                for (int i = 0;i < arr.length;i++){
//                    arr[i] = scanner.nextInt();
//                }
//                int maxLen = 0;
//                for (int i = 0;i < arr.length;i++){
//                    int len = 1;
//                    int tmp = arr[i];
//                    for (int j = i;j < arr.length-1;j++){
//                        if (arr[j+1] > tmp){
//                            len++;
//                            tmp = arr[j+1];
//                        }
//                    }
//                    if (len > maxLen){
//                        maxLen = len;
//                    }
//                }
//                System.out.println(maxLen);
//            }
//        }
        char myChar = 'g';
        String myStr = Character.toString(myChar);
        System.out.println("String is: "+myStr);
        myStr = String.valueOf(myChar);
        System.out.println("String is: "+myStr);
    }
}

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
//public static void isSan(double x1,double y1,double x2,double y2,double x3,double y3){
//    double p1 = Math.pow((y2-y1),2);
//    double p2 = Math.pow((x2-x1),2);
//    double a = p1+p2;
//    double a1 = Math.sqrt(a);
//    double p3 = Math.pow((y3-y2),2);
//    double p4 = Math.pow((x3-x2),2);
//    double b = p3+p4;
//    double b1 = Math.sqrt(b);
//    double p5 = Math.pow((y3-y1),2);
//    double p6 = Math.pow((x3-x1),2);
//    double c = p5+p6;
//    double c1 = Math.sqrt(c);
//    if(a1+b1 > c1 || a1+c1 > b1 || b1+c1 > a1){
//        System.out.println(a1+b1+c1);
//        System.out.println((1/2)*(x3-x1)*(x2-x1));
//
//    }else
//        System.out.println("Impossible");
//}

