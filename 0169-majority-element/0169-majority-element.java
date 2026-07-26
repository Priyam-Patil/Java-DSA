// Moore's voting algorithm
// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate=0;
//         int points=0;
//         for(int i=0;i<nums.length;i++){
//             if(points==0){
//                 candidate=nums[i];
//             }
//             if(candidate==nums[i]){
//                 points++;
//             }else{
//                 points--;
//             }
            
//         }
//         return candidate;
//     }
// }




import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;

    }
}