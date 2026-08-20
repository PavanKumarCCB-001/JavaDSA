class Solution {
    public int[] resultArray(int[] nums) {
        int[] result = new int[nums.length];

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]); // First Element of Nums to arr1
        arr2.add(nums[1]); // Second Element of nums to arr2

        for (int k = 2; k < nums.length; k++) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1))
                arr1.add(nums[k]);
            else
                arr2.add(nums[k]);
        }
        
        for (int i = 0; i < arr1.size(); i++)
            result[i] = arr1.get(i);

        for (int i = 0; i < arr2.size(); i++)
            result[arr1.size() + i] = arr2.get(i);

        return result;
    }
}