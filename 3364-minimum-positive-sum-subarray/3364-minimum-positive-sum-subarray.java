class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.size(); i++) {
            int s = 0;
            for (int j = i; j < nums.size(); j++) {
                s += nums.get(j);
                int len = j - i + 1;
                if (l <= len && len <= r && s > 0)
                    res = Math.min(res, s);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}