class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        Arrays.fill(arr, -1);
        int low = 0, high = nums.length - 1, first = -1, last = -1;

        while (low <= high) { // Finds the first occurence
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                first = mid;
                high = mid - 1;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        low = 0;
        high = nums.length - 1;
        while (low <= high) { // Finds the Second occurence
            int mid = (low + high) / 2; // 2 4
            if (target == nums[mid]) {
                last = mid;
                low = mid + 1;
            } else if (target > nums[mid])
                low = mid + 1; // 3
            else
                high = mid - 1;
        }

        arr[0] = first;
        arr[1] = last;
        return arr;
    }
}