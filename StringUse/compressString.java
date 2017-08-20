package StringUse;

import java.util.Scanner;

public class compressString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print(compress(str));
	}
	public static String compress(String inputString) {
		String output="";
		int count=1;
		for(int i=0;i<inputString.length()-1;i++){
			if(inputString.charAt(i)==inputString.charAt(i+1)){
				count++;
			}
			if(inputString.charAt(i)!=inputString.charAt(i+1)){
				if(count!=1){
					output=output+inputString.charAt(i)+count;
					count=1;
				}
				else if(count==1)
					output=output+inputString.charAt(i);
			}
			}
		int c=1;
		int j=inputString.length()-1;
		while(inputString.charAt(j)==inputString.charAt(j-1)){
		c++;
		j--;
	}
		if(c==1){
	output+=inputString.charAt(j);
		}
	else if(inputString.charAt(j)!=inputString.charAt(j-1)){
		output+=inputString.charAt(j);
	}
		if(c!=1)
		return output+c;
		else
			return output;
	}
}