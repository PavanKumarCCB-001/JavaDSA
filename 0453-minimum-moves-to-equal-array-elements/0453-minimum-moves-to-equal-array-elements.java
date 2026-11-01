class Solution {
    boolean equal(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                return false;
        }
        return true;
    }

    public int minMoves(int[] nums) {
        if (equal(nums))
            return 0;
        int res = 0, min = Integer.MAX_VALUE;

        // Let's find the minimum element in array
        for (int j : nums) {
            if (j < min)
                min = j;
        }

        for (int i = 0; i < nums.length; i++) // Calculate Min. No. of Moves
            res += nums[i] - min;
        return res;
    }
}