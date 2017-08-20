package recursionPrac;

import java.util.Scanner;

public class stringPal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(isStringPalindrome(str));
	}
	public static boolean isStringPalindrome(String input) {
		/*if(input.length()==1){
			return true;
		}
		else if(input.length()>1){
			if(input.charAt(0)==input.charAt(input.length()-1))
				return true;
			else
				return false;
		}
		return isStringPalindrome(input.substring(1,input.length()-1));
		{*/
	        if(input.length() == 0 || input.length() == 1)
	            return true; 
	        if(input.charAt(0) == input.charAt(input.length()-1)){
	            return isStringPalindrome(input.substring(1, input.length()-1));
	        }
	        return false;
	    }
}
