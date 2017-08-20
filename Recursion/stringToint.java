package recursionPrac;

import java.util.Scanner;

public class stringToint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int a=convertStringToInt(str);
		System.out.println(a);
	}
	public static int convertStringToInt(String input){
		int n=0;
		if(input.length()==1){
			n=input.charAt(0) - '0';
			return n-48;
		}
		n=input.charAt(input.length()-1)+10*convertStringToInt(input.substring(0,input.length()-1))-'0';
		return n-48;
	}

}
