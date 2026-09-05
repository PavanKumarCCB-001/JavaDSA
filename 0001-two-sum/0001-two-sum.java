class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] Res = new int[2]; // Because there are only 2 numbers that sum to target
        Map<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
         int ans = target - nums[i];

         if(hm.containsKey(ans)) {
            int idx = hm.get(ans);
            Res[0] = idx;
            Res[1] = i;
            break;
         }
         hm.put(nums[i] , i);   
        }
        return Res;
    }
}