package demo;
import java.util.Scanner;

public class Palindrome_String {
	
	boolean isPalindrome(String s)
	{
		String rev = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		for(int i=0, j = rev.length()-1; i < j; i++,j--)
		{
			if(rev.charAt(i) != rev.charAt(j))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter String");
		s = ob.next();
		
		Palindrome_String X = new Palindrome_String(); 
		System.out.println("String Boolean: "+X.isPalindrome(s));
		
		ob.close();
	} 
}