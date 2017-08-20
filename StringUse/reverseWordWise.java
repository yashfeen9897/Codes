package StringUse;

import java.util.Scanner;

public class reverseWordWise {
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String revWord=reverseWordWise(str);
		System.out.print(revWord);
	}
	public static String reverseWordWise(String input) {
		String output="";
		int currentWordStart=input.length()-1;
		int i=input.length()-1;
		while(i>0){
			if(input.charAt(i)==' '){
				for(int j=i+1;j<=currentWordStart;j++){
					output+=input.charAt(j);
				}
				output+=' ';
				currentWordStart=i-1;
			}
			i--;
		}
		for(int j=i;j<=currentWordStart;j++){
			output+=input.charAt(j);
		}
		return output;
	}
}
