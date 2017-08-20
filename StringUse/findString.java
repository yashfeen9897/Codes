package StringUse;

import java.util.Scanner;

public class findString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		System.out.print(findString(s,t));
	}
	public static int findString(String text, String pattern) {
		int index=0,i=0;
			index = text.indexOf(pattern);
		     	if(index==-1){
		     		return -1;
		     	}
		     	else
		     		return index;
	}
}
