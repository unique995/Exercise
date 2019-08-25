package LeetCode;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int []hash = new int[500];
        int fast = 0;
        int slow = 0;
        int max = 0;
        while (fast < s.length() && slow < s.length()){
            if (hash[s.charAt(fast)] == 0){
                hash[s.charAt(fast)] = 1;
                fast++;
                max = Math.max(max,fast-slow);
            }else {
                hash[s.charAt(slow)] = 0;
                slow++;
            }
        }
        return max;
    }
}
