class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] Res = new int[2]; // Because there are only 2 numbers that sum to target

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    Res[0] = i;
                    Res[1] = j;
                    break;
                }
            }
        }
        return Res;
    }
}