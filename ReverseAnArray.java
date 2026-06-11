package demo;
import java.util.Scanner;

public class ReverseAnArray {
	
	int[] REV(int[] a) 	{
		int t;
		for(int i=0,j=a.length-1; i!=j; i++,j--) {
			t = a[i];
			a[i] = a[j];
			a[j] = t;	}
		return a; 	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Size: ");
		int n = ob.nextInt();
		int[] a = new int[n];
		
//		int[] b = new int[a.length];		IF 2 arrays are used
		
		for(int i=0; i<a.length;i++)
			a[i] = ob.nextInt();
		
//		for(int i=0; i<b.length;i++)
//			b[i] = a[(a.length-1)-i];
		
		ReverseAnArray obj = new ReverseAnArray();
		int[] res = obj.REV(a);
		
		System.out.println("Array Elements in Reverse Order");
		for(int i: res)
			System.out.print(i + " ");
		ob.close(); }  } 