package StringUse;

import java.util.Scanner;

public class removeChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char x=s.next().charAt(0);
		System.out.print(removeAllOccurrencesOfChar(str,x));
	}
	public static String removeAllOccurrencesOfChar(String input, char c) {
		String output="";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==c){
				continue;
			}
				else
					output=output+input.charAt(i);
		}
		return output;
	}

}
