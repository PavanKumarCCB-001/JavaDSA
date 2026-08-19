class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();
        
        // Base case: prefix sum 0 exists once (before array starts)
        hm.put(0, 1);
        
        int c = 0;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            // If (currentSum - k) exists in map, add its count
            if (hm.containsKey(currentSum - k)) {
                c += hm.get(currentSum - k);
            }
            
            // Update map with currentSum occurrence
            hm.put(currentSum, hm.getOrDefault(currentSum, 0) + 1);
        }
        
        return c;
    }
}
