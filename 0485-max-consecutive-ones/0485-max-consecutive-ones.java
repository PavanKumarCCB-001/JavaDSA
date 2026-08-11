class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1)   // If 0 Occurs then Count is set back to 0
                count = 0;  
            else
                count++;        // Incrementing Count when 1 Occurs

            if (count > max)
                max = count;
        }
        return max;             // Returns Max. No. of Consecutive 1's
    }
}