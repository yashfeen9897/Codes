package recursionPrac;

import java.util.Scanner;

public class removeX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=removeX(str);
		System.out.println(ans);
	}
	public static String removeX(String input){
		
		if(input.length()==0)
			return "";
		if(input.charAt(0)=='x')
			return ""+removeX(input.substring(1));
		else
			return input.charAt(0)+removeX(input.substring(1));
		
	}

}
