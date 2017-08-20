package recursionPrac;

import java.util.Scanner;

public class addStars {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String out=addStars(str);
		System.out.println(out);
	}
	public static String addStars(String s) {
		if(s.length()<2)
			return s;
		else if(s.charAt(0)==s.charAt(1))
			return s.charAt(0)+"*"+addStars(s.substring(1));
		else
			return s.charAt(0)+addStars(s.substring(1));
	}

}
