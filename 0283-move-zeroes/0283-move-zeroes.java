class Solution {
    public void moveZeroes(int[] nums) {

        int j = -1; // Point to First Occurence of Element '0' 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break; // Exits from loop as soon as it found the first occurence of Element '0'
            }
        }

        if (j == -1) // If there is no Zero
            return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++; // Moves to next index and it has element '0' bcoz it got swapped.

            }
        }
    }
}