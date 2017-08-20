package assignment1;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n+1-i){
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
	}

}
}