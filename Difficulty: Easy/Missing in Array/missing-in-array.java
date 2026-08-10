class Solution {
	int missingNum(int arr[]) {
		// code here
		long n = arr.length + 1, sum = 0;
		
		long res_sum = (n * (n + 1)) / 2; // Sum of N Numbers
		
		for (int i = 0; i<arr.length; i++)
			sum += arr[i];              // Sum of Array Elements
		
		return (int)(res_sum - sum);
	}
}
