package NewCoder;

public class Floor {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    // 求该青蛙跳上一个n级的台阶总共有多少种跳法
    public static int JumpFloorII(int target){
        if (target <= 0){
            return 0;
        }
        int total = 1;
        for (int i = 1;i < target;i++){
            total *= 2;
        }
        return total;
    }
    //限制它一次只能跳1阶或者2阶，现在该如何解答
    public static int JumpFloor(int target){
        if(target==0)
            return 1;
        if(target==1)
            return 1;
        else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
}
