package NewCoder;


/*
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一 个逆序对。
输入一个数组,求出这个数组中的逆序对的总数 P。
 */

public class DescPair {
    public static int iPairs(int []array){
        if (array == null){
            return 0;
        }
        int len = array.length;
        int []copy = new int[len];
        System.arraycopy(array,0,copy,0,len);
        int num = iPairs(array,copy,0,len-1);
        return num;

    }
    public static int iPairs(int []array,int []copy,int begin,int end){
        if (begin == end)
            return 0;
        int mid = (begin + end)/2;
        int left = iPairs(array,copy,0,mid);
        int right = iPairs(array,copy,mid+1,end);
        int i = mid;
        int j = end;
        int pos = end;
        int count = 0;
        while (i >= begin && j > mid+1){
            if (array[i] > array[j]){
                copy[pos--] = array[i--];
                count += j-mid;
            }else
                copy[pos--] = array[j--];
        }
        while (i >= begin){
            copy[pos--] = array[i--];
        }
        while (j >= mid + 1){
            copy[pos--] = array[j--];
        }
        return left+right+count;
    }
}
