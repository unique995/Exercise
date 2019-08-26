package LeetCode;

public class longestSubstring {
    static int i = 0;
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
    public String findPalindrome(String s, int left, int right) {
        int n = s.length();
        int l = left;
        int r = right;
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
    public String LongestPalindrome(String s){
        int n = s.length();
        if (n<=1) return s;

        String longest = "";

        String str;
        for (int i=0; i<n-1; i++) {
            str = findPalindrome(s, i, i);
            if (str.length() > longest.length()){
                longest = str;
            }
            str = findPalindrome(s, i, i + 1);
            if (str.length() > longest.length()){
                longest = str;
            }
        }

        return longest;
    }
}
