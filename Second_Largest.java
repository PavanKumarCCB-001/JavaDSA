/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
*/

package demo;
import java.util.Scanner;

public class Second_Largest {
	
	public int getSecondLargest(int[] arr) {
		int largest = arr[0] , secondlargest = -1;
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i]; }
			
			else if(arr[i] > secondlargest && arr[i] != largest)
				secondlargest = arr[i];  }
		
		return secondlargest; 	}

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int s = ob.nextInt();
		
		int[] arr = new int[s];
		
		System.out.println("Enter the Elements into Array");
		for(int i=0; i<s; i++)
			arr[i] = ob.nextInt();
		
		System.out.println("Second Largest Element is: "+ new Second_Largest().getSecondLargest(arr));
		ob.close(); } }