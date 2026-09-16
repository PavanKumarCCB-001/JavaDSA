class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0], s = 0;

        for (int i : nums) {
            s += i;

            if (s > max_sum)
                max_sum = s;

            if (s < 0)
                s = 0;
        }
        return max_sum;
    }
}