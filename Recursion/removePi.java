package recursionPrac;

import java.util.Scanner;

public class removePi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans=replace(str);
		System.out.println(ans);
	}
	public static String replace(String input){
		if(input.length()<2)
			return input;
		else if (input.charAt(0) == 'p' && input.charAt(1) == 'i')
			    return "3.14" + replace(input.substring(2));
		else
		  return input.charAt(0) + replace(input.substring(1));
		}
}