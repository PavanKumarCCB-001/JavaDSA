class Solution {
    public int singleNumber(int[] nums) {
        int ele = 0;

        for (int num : nums)
            ele ^= num;         // Performing XOR so the Pairs will be Cancelled.

    return ele;
    }
}