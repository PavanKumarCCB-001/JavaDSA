class Solution {
    public int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) // If the Array is Having only 1 Element
            return nums[0];

        else if (nums[0] != nums[1]) // If the 1st Element is Single
            return nums[0];

        else if (nums[nums.length - 1] != nums[nums.length - 2]) // If the Single Element is at End
            return nums[nums.length - 1];

        else { // Finding the Single Element using Binary Search

            int low = 1, high = nums.length - 2;
            while (low <= high) {
                int mid = (low + high) / 2;

                if ((nums[mid] != nums[mid + 1]) && (nums[mid] != nums[mid - 1]))
                    return nums[mid];

                else if ((mid % 2 == 0 && nums[mid] != nums[mid+1]) || (mid % 2 == 1 && nums[mid] != nums[mid - 1])) // Element is at Left
                    high = mid - 1;

                else // Element is at Right
                    low = mid + 1;
            }
        }
        return -1;
    }
}