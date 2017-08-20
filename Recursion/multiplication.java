package recursionPrac;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int p=multiplyTwoIntegers(m,n);
		System.out.println(p);
	}
	public static int multiplyTwoIntegers(int m, int n){
		int ans;
		if(n==0)
			return 0;
		else if(n==1)
			return m;
		int smallans=multiplyTwoIntegers(m,n-1);
		ans=m+smallans;
		return ans;
	}
}
