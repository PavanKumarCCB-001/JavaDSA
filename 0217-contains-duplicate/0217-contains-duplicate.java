class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num) && hm.get(num) >= 1)
                return true;
            hm.put(num, hm.getOrDefault(num, 0) + 1); // Put into Map if the Element is not there.
        }
        return false; // Means Duplicate is not there.
    }
}