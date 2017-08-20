package assignment1;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		s.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				if(j==i || j==1)
				System.out.print("1");
				else
				System.out.print("2");
				j=j+1;
			}
			i++;
			System.out.println();
		}
		

	}

}
