package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RAAInbuilt{
	public static void main(String[] args) 	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		int n = ob.nextInt();
		
		List<Integer> R = new ArrayList<>();
		
		System.out.println("Enter Elements");
		for(int i=0; i<n; i++)
			R.add(ob.nextInt());
		
		Collections.reverse(R);
		
		System.out.println("In Reverse Order");
		for(int i:R) System.out.print(i+" ");
		
		ob.close();   } }  