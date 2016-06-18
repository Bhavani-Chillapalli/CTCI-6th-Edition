import java.util.Arrays;
import java.util.Scanner;


public class Permutation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1 = in.nextLine();
		System.out.println("Enter second string:");
		String string2 = in.nextLine();
		System.out.println(method1(string1,string2));
	}
	
	public static boolean method1(String string1,String string2){
		if(string1.length()!=string2.length()) return false;
		
		char [] a = string1.toCharArray();
		char [] b = string2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}
}