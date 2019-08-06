package NewCoder;

public class printJuZhen {
    public static void print(int [][]array,int start,int end){
        if (start > end || end < 0)
            return;
        for (int i = start;i <= end;i++){
            System.out.print(array[start][i]);
        }
        for (int i = start+1;i <= end;i++){
            System.out.print(array[i][end]);
        }
        for (int i = end-1;i >= start;i--){
            System.out.print(array[end][i]);
        }
        for (int i = end-1;i >= start+1;i--){
            System.out.print(array[i][start]);
        }
        print(array,start+1,end-1);
    }
    public static void main(String[] args) {
        int [][]array =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(array,0,3);
    }
}
