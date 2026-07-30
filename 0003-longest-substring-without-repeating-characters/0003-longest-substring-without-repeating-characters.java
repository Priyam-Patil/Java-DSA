
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int maxL = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (list.contains(ch)) {
                list.remove(0);
                // when a duplicate arrives, we must shrink the substring from its left side. Index 0 is the leftmost character:
            }
            list.add(ch);
            maxL = Math.max(maxL, list.size());
        }
        return maxL;
    }
}