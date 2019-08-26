package LeetCode;

public class reverseInt {
    public static int ReverseInt(int x){
        long temp = 0;
        while (x != 0){
            temp *= 10;
            temp += x%10;
            x /= 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
            return 0;
        return (int) temp;
    }

    public static void main(String[] args) {
        System.out.println(ReverseInt(321));
    }
}
