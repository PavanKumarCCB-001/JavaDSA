package demo;
import java.util.Scanner;

public class Selection_sort {
	
	Selection_sort(int[] arr) {
		int len = arr.length, min = 0, i;		// Not to get error initialized min with 0
		
		for(i=0; i<= len-2; i++) {
			min = i;
			
			for(int j=i; j<= len-1; j++) {
				if(arr[j] < arr[min])
					min = j; 			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;	}
		
		System.out.print("Sorted Array is: ");
		for(int ar:arr) System.out.print(ar+" "); 	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int s = ob.nextInt();
		
		System.out.println("Enter Elements in to Array");
		int[] arr = new int[s];
		for(int i=0; i<s;i++)
			arr[i] = ob.nextInt();
		
		new Selection_sort(arr);
				
		ob.close();   } }