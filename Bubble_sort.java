package demo;
import java.util.Scanner;

public class Bubble_sort {
	
	Bubble_sort(int[] arr) {
		int len = arr.length;
		
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-i-1; j++) {
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} } }
		System.out.println("Sorted Array is:");
		for(int a : arr) System.out.print(a+" "); 	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int s = ob.nextInt();
		
		System.out.println("Enter Elements into Array");
		int[] arr = new int[s];
		for(int i=0;i<s;i++)
			arr[i] = ob.nextInt();
		
		new Bubble_sort(arr);
		
		ob.close();  }  } 