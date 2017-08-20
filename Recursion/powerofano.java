package recursionPrac;

import java.util.Scanner;

public class powerofano {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(power(x,n));
	}
	public static int power(int x,int n){
		if(n==0){
			return 1;
		}
		int smallans=power(x,n-1);
		int num=x*smallans;
		return num;
	}

}
