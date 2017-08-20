package inputoutput;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int i=1,j=1,p;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=1;j<=(2*(n-i));j++)
			{
				System.out.print(" ");
			}
			p=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(p--);
			}
				System.out.println();
		}
		
	}

}
