class Solution {
    public boolean containsDuplicate(int[] nums) {
        var hm = new HashMap<Integer, Integer>();

        for (int num : nums)
            hm.put(num, hm.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> R : hm.entrySet()) {
            if (R.getValue() > 1)
                return true;
        }
        return false;
    }
}