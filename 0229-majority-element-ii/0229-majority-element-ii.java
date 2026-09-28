class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : nums)
            hm.put(i, hm.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() > (nums.length / 3))
                res.add(m.getKey());
        }
        return res;
    }
}