class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int s = 0, cnum = nums[i];
            while(cnum > 0) {       // Calculates Digit Sum
                s += cnum % 10;
                cnum /= 10;
            }
            if(s == i)
                    return i;
        }
    return -1;
    }
}