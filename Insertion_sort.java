package demo;
import java.util.Scanner;

public class Insertion_sort {
	
	public Insertion_sort(int[] arr) {
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			int pos = i;
			for(int j=0; j<i; j++) {
				if(arr[pos] < arr[i-j-1]) {
					int temp = arr[pos];
					arr[pos] = arr[i-j-1];
					arr[i-j-1] = temp;
					
					pos = i-j-1;	// Update when Swapped
				} else {
					break; } } }
	System.out.println("Sorted Array is:");
	for(int a : arr) System.out.print(a+" ");  }

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int s = ob.nextInt();
		
		System.out.println("Enter Elements into Array");
		int[] arr = new int[s];
		for(int i=0;i<s;i++)
			arr[i] = ob.nextInt();
		
		new Insertion_sort(arr);
		
		ob.close(); } }