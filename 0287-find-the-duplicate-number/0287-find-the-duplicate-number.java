class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int ans = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                ans = nums[i];
                break;
            }
            i++;
        }
        return ans;
    }
}