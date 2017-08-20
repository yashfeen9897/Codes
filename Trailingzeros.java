package inputoutput;

import java.util.Scanner;

public class Trailingzeros {
	public static int countTrailingZerosInFact(int num){
		int currentPowerof5=5,output=0;
		while(currentPowerof5<=num){
			output+=num/currentPowerof5;
			currentPowerof5*=5;
		}
		return output;
}	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int out=0;
		out=countTrailingZerosInFact(num);
		System.out.print(out);
	}	
}