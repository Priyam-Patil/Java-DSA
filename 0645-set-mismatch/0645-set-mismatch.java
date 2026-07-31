class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        int duplicate = -1;
        int missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        if (nums[nums.length - 1] != nums.length) {
            missing = nums.length;
        }
        ans[0] = duplicate;
        ans[1] = missing;
        return ans;
    }
}