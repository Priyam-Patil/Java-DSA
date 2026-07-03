import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);//sort in ascending order

        int n=nums.length;

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int l=j+1;
                int r=n-1;//last value
                while(l<r){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        // so next to find next pair which = target and for that increment l and r

                        while(l<r && nums[l]==nums[l+1]) l++;//same value appeared
                        while(l<r && nums[r]==nums[r-1]) r--;//same value appeared

                        l++;
                        r--; 
                    }else if(sum>target){
                        r--;
                    }else{
                        // sum<target
                        l++;
                    }
                }
            }
        }
        return list;

    }
}