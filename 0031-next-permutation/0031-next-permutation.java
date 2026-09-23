class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1, n = nums.length;

        for (int i = n - 2; i >= 0; i--) { // Find Dip
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) { // Reverse if the given array is lexicographically the greatest.
            int start = idx + 1, end = n - 1;
            while (start < end) {
                int t = nums[start];
                nums[start] = nums[end];
                nums[end] = t;
                start++;
                end--;
            }
            return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[idx]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        // Place the remaining the part of the array in sorted manner using by reversing it.

        int start = idx + 1, end = n - 1;
        while (start < end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}