package LeetCode;

public class twoSum {
    public int [] TwoSum(int []arr,int target){
        int []index = new int[2];
        for (int i = 0;i < index.length;i++){
            for (int j = index.length-1;j > i;j--){
                if (arr[i] + arr[j] == target){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}
