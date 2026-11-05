class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0, i = 0;

        while (i < arr1.length) {
            int j = 0;
            while (j < arr2.length) {
                if (Math.abs(arr1[i] - arr2[j]) > d)
                    j++;
                else
                    break;
            }
            if (j == arr2.length)
                c++;
            i++;
        }
        return c;
    }
}