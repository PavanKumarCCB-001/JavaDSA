class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];

        int max_prod = 0;
        for(int i = 0; i<nums.length; i++) {
            int prod = 1;
            for(int j=i; j<nums.length; j++){
                prod *= nums[j];
                if(prod > max_prod)
                    max_prod = prod;
            }
        }
    return max_prod;
    }
}