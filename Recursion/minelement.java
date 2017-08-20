package recursionPrac;

import java.util.Scanner;

public class minelement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println(findminElement(a));
	}
	public static int findminElement(int a[]){
		int c=0;
		if(a.length==0)
			return Integer.MAX_VALUE;
		if(a.length==1)
			return a[0];
		int x=a.length-1;
		int b[]=new int[x];
		for(int i=1;i<a.length;i++){
			b[i-1]=a[i];
		}
		c=findminElement(b);
		if(a[0]<c){
			return a[0];
		}
		else{
			return c;
		}
			
	}

}
