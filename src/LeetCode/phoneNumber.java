package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class phoneNumber {
    static String[]map = {"","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits){
        List<String> list = new ArrayList<String>();
        getSequence(digits,0,"",list);
        return list;
    }
    public static void getSequence(String digits,int i,String letter,List<String> list){
        if (i >= digits.length()){
            if (letter != "")
                list.add(letter);
            return;
        }
        int num = digits.charAt(i)-'0'-1;
        for (int j = 0;j < map[num].length();j++){
            getSequence(digits,i+1,letter+map[num].charAt(j),list);
        }
    }
}
