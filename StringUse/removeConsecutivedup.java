package StringUse;

import java.util.Scanner;

public class removeConsecutivedup {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print(removeConsecutiveDuplicates(str));
	}
	public static String removeConsecutiveDuplicates(String input) {
		String output="";
		int i=0;
		while(i<input.length()-1){
			if(input.charAt(i)!=input.charAt(i+1)){
				output+=input.charAt(i);
			}
			i++;
		}
		if(i==input.length()-1){
			output+=input.charAt(i);
		}
		
		return output;
	}

}
