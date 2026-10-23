class Solution {
    public int sortPermutation(int[] nums) {
        int k = -1; // All bits set.
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                k &= nums[i];
        }
        return Math.max(k, 0);
    }
}