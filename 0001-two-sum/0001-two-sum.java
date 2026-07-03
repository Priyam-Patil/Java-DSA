// using HashMap approach
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        // stores the {value,index} pair

        for(int i=0;i<nums.length;i++){
            int rem_val=target-nums[i];

            if(hm.containsKey(rem_val)){//check if value is present
int arr[]={hm.get(rem_val),i};
return arr;//return the indexes of two numbers
            }else{
                // put in hashmap
                hm.put(nums[i],i);
            }
        }
        return null;

    }
}