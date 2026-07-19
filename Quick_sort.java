package demo;
import java.util.Scanner;

public class Quick_sort {
	public void quickSort(int[] arr, int low, int high) {
		
		if (low < high) {   // Sorting When Array has More than 1 Element.
			
			int pidx = partition(arr, low, high);
			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high); } }
	
	private int partition(int[] arr, int low, int high) {
		
		int pivot = arr[low] , i = low, j = high;
		
		while(i<j) {
		    
		    while(arr[i] <= pivot && i <= high-1)
		    i++;
		    
		    while(arr[j] > pivot && j >= low+1)
		    j--;
		    
		    if(i < j) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp; } }
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j; }

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int s = ob.nextInt(); 
		int[] nums = new int[s];
		System.out.println("Enter the Elements into Array");
		for(int i=0; i<s; i++)
			nums[i] = ob.nextInt();
		
		Quick_sort obj = new Quick_sort();
		obj.quickSort(nums, 0, nums.length-1);
		
		System.out.println("Sorted Array is");
		for(int i : nums)
			System.out.println(i+" ");
		
		ob.close(); } } 