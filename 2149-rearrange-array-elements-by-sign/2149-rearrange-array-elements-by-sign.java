class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int[] modified_arr = new int[nums.length];
        
        int i = 0, j = 0;       // Declared here bcoz, pointers should remember the prev pos.
        for (int num : nums) {
            if (num > 0)
                pos[i++] = num;
            else
                neg[j++] = num;
        }
        i = 0;
        j = 0;
        for (int k = 0; k < modified_arr.length; k++) {
            if(k % 2 == 0)
                modified_arr[k] = pos[i++];
            else
                modified_arr[k] = neg[j++];
        }
        return modified_arr;
    }
}