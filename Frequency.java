package demo;
import java.util.*;

public class Frequency {
	ArrayList<ArrayList<Integer>> count(int[] arr) 
	{
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		var hm = new HashMap<Integer,Integer>();	
		
		for(int i=0;i<arr.length;i++)
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		
		for(Map.Entry<Integer, Integer> e: hm.entrySet())
		{
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(e.getKey());
			temp.add(e.getValue());
			res.add(temp);
		}
		return res; }

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Size: ");
		int n = obj.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
			a[i] = obj.nextInt();
		
		Frequency ob = new Frequency();
		System.out.println(ob.count(a));
		
		obj.close(); } }