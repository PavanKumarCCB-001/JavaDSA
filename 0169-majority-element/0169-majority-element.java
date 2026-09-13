class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for (int num : nums)
            hm.put(num, hm.getOrDefault(num, 0) + 1); // Frequency Counting.

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > nums.length / 2)
                res = e.getKey(); // Storing Majority Element
        }
        return res;
    }
}