package NewCoder;

public class diver {
    public int divide(int dividend, int divisor) {

        if (divisor == 0){
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean flag;
        flag = (dividend ^ divisor) < 0;
        long d1 = Math.abs((long) dividend);
        long d2 = Math.abs((long) divisor);
        int count = 0;
        for (int i = 31;i >= 0;i--){
            if ((d1 >> i) >= d2){
                count += 1;
                d1 -= d2 << i;
            }
        }
        return flag ? -count : count;
    }
}
