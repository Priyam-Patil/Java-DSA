import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // add all values to hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int ans = 0;
        // traverse through each value
        for (int i : set) {
            if (!set.contains(i - 1)) {//one decre value not present
                int current = i + 1;
                while (set.contains(current)) {
                    current++;
                }
                int endPoint = current - 1;
                ans = Math.max(ans, endPoint - i + 1);
            }

        }

        return ans;
    }
}