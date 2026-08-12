class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        for(Map.Entry<Integer,Integer> E : hm.entrySet()) {
            if(E.getValue() == 1) {
                k = E.getKey();
                break;
            }
        }
    return k;
    }
}