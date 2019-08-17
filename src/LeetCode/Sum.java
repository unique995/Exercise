package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            dfs(1,m,n);
            for (ArrayList<Integer> list1 : res){
                int i = 0;
                for (;i < list1.size()-1;i++){
                    System.out.print(list1.get(i)+" ");
                }
                System.out.println(list1.get(i));
            }
        }
    }
    public static void dfs(int index,int count,int n){
        if (count == 0){
            res.add(new ArrayList<>(list));
        }else {
            for (int i = index;i<= count && i <= n;i++){
                list.add(i);
                dfs(i+1,count-i,n);
                list.remove(list.size()-1);
            }
        }
    }
}
