class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // Slow pointer
        for(int j=0; j<nums.length; j++) {  // j is the Fast pointer
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;   }
        }
        return i; // returns the number of elements that are not equal to val.
    }
}