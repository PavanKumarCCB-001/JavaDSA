class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mx = nums[n - 1], mx2 = nums[n - 2], mx3 = nums[n - 3];
        int mn = nums[0], mn2 = nums[1], mn3 = nums[2];
        int ans = mx - mn;
        ans = Math.min(ans, (mx2 - mn2));
        ans = Math.min(ans, (mx - mn3));
        ans = Math.min(ans, (mx3 - mn));
        return ans;
    }
}