class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ls = new ArrayList<>(); // Stores the Missing Element.

        // Finding the Smallest & Largest with Arrays.stream()
        int smallest = Arrays.stream(nums).min().getAsInt();
        int largest = Arrays.stream(nums).max().getAsInt();

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) // Adding Array Elements into HashSet
            hs.add(num);

        for (int i = smallest + 1; i < largest; i++) {
            if (!hs.contains(i))    // 
                ls.add(i);
        }

        return ls; // Returning list.
    }
}