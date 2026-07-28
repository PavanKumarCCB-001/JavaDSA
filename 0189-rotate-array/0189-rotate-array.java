class Solution {

    public void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }

    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;    // If in case, K > nums.length

        if (k == 0)
            return;

        reverse(nums, 0, nums.length - 1); // Reverse the Entire Array 

        reverse(nums, 0, k - 1); // Reverse the K elements

        reverse(nums, k, nums.length - 1); // Reverse the nums.length - k elements
    }
}