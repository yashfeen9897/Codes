package StringUse;

import java.util.Scanner;

public class stringRotate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=s.nextInt();
		System.out.print(rotateString(str,n));
	}
	public static String rotateString(String inputString, int n){
		String output="";
		int j=inputString.length()-n;
		int i=0;
		for(i=j;i<inputString.length();i++){
			output+=inputString.charAt(i);
		}
		i=0;
		for(i=0;i<j;i++){
			output+=inputString.charAt(i);
		}
		return output;
	}

}
