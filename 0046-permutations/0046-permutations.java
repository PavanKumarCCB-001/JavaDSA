class Solution {

    void recurpermute(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {

        // Base case
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds)); // Keeps changing wrt. Backtracking.
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurpermute(nums, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length]; // All values in this array are initialized with false.

        recurpermute(nums, ans, ds, freq);

        return ans;
    }
}