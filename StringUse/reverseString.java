package StringUse;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String rev=reverseWordWise(str);
		System.out.print(rev);
	}
	public static String reverseWordWise(String input) {
		String output="";
		int currentwordstart=input.length();
		int i=input.length();
		for(int j=i-1;j>=0;j--){
			output+=input.charAt(j);
		}
		return output;
	}

}
