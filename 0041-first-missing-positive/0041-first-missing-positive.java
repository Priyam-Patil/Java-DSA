

import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int expected=1;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                continue;
            }

            if(nums[i]==expected){
                expected++;
            }
            if(nums[i]>expected){
                return expected;
            }
        }
        return expected;
       
    }
}