package demo;
import java.util.*;

public class MostFrequent {
	public int Ele(int[] arr) {
        
        Map<Integer,Integer> Hm = new HashMap<>();
        
        for(int i : arr)
        Hm.put(i, Hm.getOrDefault(i,0)+1);
        
        int Max_Freq = 0 , Res = 0;
  
        for(Map.Entry<Integer,Integer> Rm : Hm.entrySet())
        {
            if(Rm.getValue() > Max_Freq || Rm.getValue() == Max_Freq && Rm.getKey() > Res)
            {
                Max_Freq = Rm.getValue();
                Res = Rm.getKey();
            }
        }
        return Res; }

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int s = ob.nextInt();
		
		int[] a = new int[s];
		
		System.out.println("Enter the Elements into Array");
		for(int i=0;i<a.length;i++)
			a[i] = ob.nextInt();
		
		MostFrequent obj = new MostFrequent();
		System.out.println(obj.Ele(a));
		
		ob.close(); } }