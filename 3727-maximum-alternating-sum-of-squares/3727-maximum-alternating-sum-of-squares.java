class Solution {
    public long maxAlternatingSum(int[] nums) {

        long res = 0;
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) // Squaring Every Number from nums & storing in arr
            arr[i] = nums[i] * nums[i];

        Arrays.sort(arr); // Sorting arr

        int k = nums.length / 2; // We subtract from res these many elements present at arr

        for (int i = 0; i < k; i++)
            res -= arr[i];
        
        for(int i = k; i<arr.length;i++)
            res += arr[i];
    return res;
    }
}