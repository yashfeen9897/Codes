package recursionPrac;

import java.util.Scanner;

public class countZeroes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=countZerosRec(n);
		System.out.println(c);
	}
	public static int countZerosRec(int input){
		if(input<9){
			if(input==0)
				return 1;
			else
				return 0;
		}
		int p=0;
		p=countZerosRec(input/10);
		int r=input%10;
		if(r==0)
			return p+1;
		else 
			return p;
	}

}
