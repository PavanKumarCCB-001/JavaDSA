class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> res = new ArrayList<>();
        int low = 0, high = nums.length - 1, first = -1, last = -1;

        Arrays.sort(nums);

        // Finds the 1st occurence index
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                first = mid;
                high = mid - 1;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        // Finds the last occurence based on index
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                last = mid;
                low = mid + 1;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        for (int i = first; (i <= last && first != -1); i++)
            res.add(i);
        return res;
    }
}