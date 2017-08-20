package recursionPrac;

import java.util.Scanner;

public class numtowords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		numtowords(n);
	}
	public static void numtowords(int n){
		if(n<10){
			n=n%10;
			printDigit(n);
			return;
		}
		numtowords(n/10);
		printDigit(n%10);	
	}
	public static void printDigit(int x){
		if(x==0)
			System.out.print("Zero ");
		else if(x==1)
			System.out.print("One ");
		else if(x==2)
			System.out.print("Two ");
		else if(x==3)
			System.out.print("Three ");
		else if(x==4)
			System.out.print("Four ");
		else if(x==5)
			System.out.print("Five ");
		else if(x==6)
			System.out.print("Six ");
		else if(x==7)
			System.out.print("Seven ");
		else if(x==8)
			System.out.print("Eight ");
		else if(x==9)
			System.out.print("Nine ");
	}

}
