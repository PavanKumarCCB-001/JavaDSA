/*
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
*/

package demo;
import java.util.Scanner;

public class Sorted_Array {
	public boolean issorted(int[] arr) {
		for(int i=0; i < arr.length - 1; i++) {
			
			if(arr[i] > arr[i+1])
				return false;	}
		return true; 	// When the Array is Sorted.
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Array Size: ");
		int n = ob.nextInt();
		int[] arr = new int[n]; 
		
		System.out.println("Enter Elements into Array");
		for(int i=0; i<n; i++)
			arr[i] = ob.nextInt();
		
		System.out.println(new Sorted_Array().issorted(arr));
			
		ob.close(); } } 