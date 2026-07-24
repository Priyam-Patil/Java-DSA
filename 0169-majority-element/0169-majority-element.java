// Moore's voting algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int points=0;
        for(int i=0;i<nums.length;i++){
            if(points==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                points++;
            }else{
                points--;
            }
            
        }
        return candidate;
    }
}