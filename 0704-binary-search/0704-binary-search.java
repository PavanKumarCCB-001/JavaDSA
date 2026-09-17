class Solution {

    int BS(int[] nums, int low, int high, int target) {
        int idx = -1;
        if (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid])
                idx = mid;
            else if (target > nums[mid])
                return BS(nums, mid + 1, high, target);
            else
                return BS(nums, low, mid - 1, target);
        }
        return idx;
    }

    public int search(int[] nums, int target) {
        return BS(nums, 0, nums.length - 1, target);
    }
}