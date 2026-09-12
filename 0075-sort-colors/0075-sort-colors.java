class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0, ones = 0, twos = 0, idx = 0;

        for (int num : nums) {
            if (num == 0)
                zeros++;
            else if (num == 1)
                ones++;
            else
                twos++;
        }
        while (zeros-- > 0)
            nums[idx++] = 0;
        while (ones-- > 0)
            nums[idx++] = 1;
        while (twos-- > 0)
            nums[idx++] = 2;
    }
}