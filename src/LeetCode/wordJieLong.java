package LeetCode;

import java.util.HashSet;
import java.util.List;

public class wordJieLong {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList){
        if (wordList.size() == 0 || wordList == null)
            return 0;
        HashSet<String> start = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        HashSet<String> dic = new HashSet<>(wordList);
        start.add(beginWord);
        end.add(endWord);
        if ( !dic.contains(endWord))
            return 0;
        return BFS(start,end,dic,2);
    }
    public static int BFS(HashSet<String> start,HashSet<String> end,HashSet<String> dic,int l){
        if (start.size() == 0)
            return 0;
        if (start.size() > end.size()){
            return BFS(end,start,dic,l);
        }
        dic.removeAll(start);
        HashSet<String> next = new HashSet<>();
        for (String s:start) {
            char[]array = s.toCharArray();
            for (int i = 0;i < array.length;i++){
                char temp = array[i];
                for (char c = 'a';c <= 'z';c++){
                    if (temp == c)
                        continue;
                    array[i] = c;
                    String newStr = new String(array);
                    if (dic.contains(newStr)){
                        if (end.contains(newStr)){
                            return 1;
                        }else {
                            next.add(newStr);
                        }
                    }
                }
                array[i] = temp;
            }
        }
        return BFS(next,end,dic,l+1);
    }
    public static void main(String[] args) {

    }
}
