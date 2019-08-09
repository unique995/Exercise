package offer;

import java.util.ArrayList;

public class Once {
    public static void once(int []array,int []num1,int []num2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0;i < array.length;i++){
            if (!list.contains(array[i])){
                list.add(array[i]);
            }else
                list.remove(new Integer(array[i]));
        }
        if (list.size() > 1){
            num1[0] = list.get(0);
            num2[0] = list.get(0);
        }
    }
}
