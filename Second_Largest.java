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