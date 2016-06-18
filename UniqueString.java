/* Arrays and Strings - Problem 1 */
import java.util.Scanner;



public class UniqueString {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = in.nextLine();
		System.out.println(method(input));
	}
	public static boolean method(String input){
	    boolean Unique = false;

	    for(char c : input.toCharArray()){
	        if(input.indexOf(c) == input.lastIndexOf(c)){
	            Unique = true;
	        } else {
	            Unique = false;
	        }
	    }

	    return Unique;
	}
	
}
