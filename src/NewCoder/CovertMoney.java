package NewCoder;

import java.util.Scanner;

public class CovertMoney {
    private final static char[] num = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖', '拾',
            '佰', '仟', '万', '亿'};
    public static String Covert(double d){
        long n = (long) d;
        StringBuilder builder = new StringBuilder("人民币");
        if (n > 0){
            convert(n,builder);
            builder.append('元');
        }

        int v = (int) (d * 100 - n * 100 + 0.0001);
        int i = v / 10;
        int j = v % 10;

        if (i == 0 && j == 0){
            builder.append('整');
            return builder.toString();
        }
        if (i != 0){
            builder.append(num[i]).append('角');
        }
        if (j != 0){
            builder.append(num[j]).append('分');
        }
        return builder.toString();
    }
    public static void convert(long n, StringBuilder builder) {
        if (n >= 100000000){
            long q = n/100000000;
            long r = n%100000000;

            convert(q,builder);
            builder.append("亿");

            if (r != 0){
                convert(r,builder);
            }
        }else if (n >= 10000){
            long q = n / 10000;
            long r = n % 10000;

            convert(q,builder);
            builder.append('万');

            if (r != 0 ){
                if (r < 100){
                    builder.append('零');
                }
                convert(r,builder);
            }
        }else if (n >= 1000){
            long q = n / 1000;
            long r = n % 1000;

            convert(q,builder);
            builder.append('仟');
            if (r != 0){
                if (r < 100){
                    builder.append('零');
                }
                convert(r,builder);
            }
        }else if (n >= 100){
            long q = n / 100;
            long r = n % 100;

            convert(q,builder);
            builder.append('佰');

            if (r != 0 ) {
                if (r < 10){
                    builder.append('零');
                }
                convert(r,builder);
            }
        }else if (n >= 10){
            long q = n / 10;
            long r = n % 10;
            if (q > 1){
                convert(q,builder);
            }
            builder.append('拾');

            if (r != 0){
                convert(r,builder);
            }
        }else {
            builder.append(num[(int) n]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double m = scanner.nextDouble();
            System.out.println(Covert(m));
        }
    }
}
