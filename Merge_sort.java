package demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Merge_sort {
	
	void merge(int[] nums, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();		// Adding sorted elements into the Temporary Array while Merging.
		int left = low, right = mid+1;
		
		while(left <= mid && right <= high) {
			
			if(nums[left] <= nums[right])	// Adding the Left Sub Array Elements
				temp.add(nums[left++]);
			else 
				temp.add(nums[right++]);	// Adding the Right Sub Array Elements  
			}
		
		while(left<=mid)					// Remaining Elements from the Left Sub Array
			temp.add(nums[left++]);
		
		while(right <= high)				// Remaining Elements from the Right Sub Array
			temp.add(nums[right++]);
		
		for(int i=low; i<=high; i++)
			nums[i] = temp.get(i-low);		// Copying the Elements from temp to Original array 'nums'.
	}
	
	void divide(int[] nums, int low, int high) {
		if(low >= high) return;
		
		int mid = (low + high) / 2;
		divide(nums, low, mid);
		divide(nums, mid+1, high);
		merge(nums, low, mid, high); }
	
	public int[] sortArray(int[] nums) 	{
		divide(nums, 0, nums.length-1);
		return nums; 	}

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int s = ob.nextInt(); 
		int[] nums = new int[s];
		System.out.println("Enter the Elements into Array");
		for(int i=0; i<s; i++)
			nums[i] = ob.nextInt();
		
		Merge_sort obj = new Merge_sort();
		
		System.out.println("Sorted Array is");
		for(int i: obj.sortArray(nums))
			System.out.print(i+" ");
		
		ob.close();  } }