package assignments;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdaefbwcc";
        int maxLength = longestSubString(str);
        System.out.println("length of longest substring is "+maxLength);
    }

    private static int longestSubString(String str) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < str.length(); end++){
            char rightChar = str.charAt(end);
            if(map.containsKey(rightChar)){
                start = Math.max(start, map.get(rightChar)+1);
            }
            map.put(rightChar, end);
            max = Math.max(max,end - start + 1);
        }
        return max;
    }
}
