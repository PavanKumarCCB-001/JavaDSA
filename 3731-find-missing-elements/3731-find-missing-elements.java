class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ls = new ArrayList<>();

        int smallest = nums[0], largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest)
                smallest = nums[i]; // Finds Smallest

            else if (nums[i] > largest)
                largest = nums[i]; // Finds Largest
        }

        for (int i = smallest + 1; i < largest; i++) { // Iterates through range

            boolean found = false; // Assuming element as not found.

            for (int j = 0; j < nums.length; j++) { // Traverses through Array
                if (i == nums[j]) {
                    found = true; // If found then, we break loop
                    break;
                }
            }
            if (!found) {
                ls.add(i); // Adding into List if not found.
            }
        }
        return ls; // Returning list.
    }
}