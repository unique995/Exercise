import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static int Search(int []arr,int num){
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (arr[mid] < num){
                l = mid+1;
            }else if(arr[mid] > num){
                l = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int Fun(int num){
        int sum = 1;
        for (int i = 1;i <= num;i++){
            sum *= i;
        }
        return sum;
    }
    public static void Tail(int num){
        int sum = Fun(num);
        String str = String.valueOf(sum);
        char []arr = str.toCharArray();
        for (int i = arr.length-1;i >= 0;i--){
            if (arr[i] != '0'){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void Spilt(int num){
        int [][]arr = new int[num+1][num+1];
        for (int i = 0;i < (num+1);i++){

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1){
            System.out.println(2);
        }else if (num == 2){
            System.out.println(3);
        }else if (num % 2 == 1){
            System.out.println(num-2);
        }else {
            System.out.println(num-1);
        }






//        String str = "爱讯飞789swr1wwen34ifly65tek";
//        char []arr = str.toCharArray();
//        char []arrs = new char[arr.length];
//        int j = 0;
//        int count = 0;
//        for (int i = 0;i < arr.length;i++){
//            if (arr[i] >= '0' && arr[i] <= '9'){
//                arrs[j++] = arr[i];
//                count++;
//            }
//
//        }
//        if (count == 0){
//            System.out.println("-1");
//        }else {
//            Arrays.sort(arrs);
//            for (int i = arrs.length-count;i < arrs.length;i++){
//                System.out.print(arrs[i]);
//            }
//        }
       // Scanner scanner = new Scanner(System.in);
       // while (scanner.hasNext()){
//            char []arr = scanner.next().toCharArray();
//            char []arrs = new char[arr.length];
//            int j = 0;
//            int count = 0;
//            for (int i = 0;i < arr.length;i++){
//                if (arr[i] >= '0' && arr[i] <= '9'){
//                    arrs[j++] = arr[i];
//                    count++;
//                }
//
//            }
//            if (count == 0){
//                System.out.println("-1");
//            }else {
//                Arrays.sort(arrs);
//                for (int i = arrs.length-count;i < arrs.length;i++){
//                    System.out.print(arrs[i]);
//                }
//            }

        //}

//       int []arr = {11,13,15,17,19,21};
//       int num = 19;
//       int key = Search(arr,19);
//       if (key >= 0){
//           System.out.println(key+1);
//       }
































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

