import java.util.Scanner;

public class Patter1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		pattern(n);
	}
	public static void pattern(int n)
	{
		int i=1,j=1;
		for(i=1;i<=n;i++)
		{
			int p=i;
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++){
				System.out.print(p);
				p++;
			}
			p=p-2;
			for(j=1;j<=i-1;j++){
				System.out.print(p);
				p--;
			}
			System.out.println();
			
		}

	}

}
