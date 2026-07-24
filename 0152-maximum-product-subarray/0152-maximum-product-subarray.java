
class Solution {
    public int maxProduct(int[] nums) {
        int max_prod=Integer.MIN_VALUE;
        int prefix_prod=0;
        int sufix_prod=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(prefix_prod==0){
                prefix_prod=1;
            }
            if(sufix_prod==0){
                sufix_prod=1;
            }
            prefix_prod*=nums[i];

            sufix_prod*=nums[n-1-i];

            max_prod=Math.max(max_prod,Math.max(prefix_prod,sufix_prod));
        }
        return max_prod;
    }
}