class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        int res_sum = (n * (n + 1)) / 2; // Sum of N Natural Numbers

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        return (res_sum - sum);
    }
}