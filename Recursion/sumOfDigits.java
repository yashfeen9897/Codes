package recursionPrac;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=sumOfDigits(n);
		System.out.println(p);
	}
	public static int sumOfDigits(int input){
	    int ans=0;
		if(input<9){
	    	return input;
	    }
	    int smallans=sumOfDigits(input/10);
	    ans=smallans+(input%10);
	    return ans;
	}

}
