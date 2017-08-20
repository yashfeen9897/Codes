package inputoutput;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]=takeInput();
		selectionSort(a);
	}
		
	public static int[] takeInput()
		{
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			return a;
		}
	public static void printArray(int rev[])
		{
			for(int i=0;i<rev.length;i++)
			{
				System.out.print(rev[i]);
				System.out.print(" ");
			}
			System.out.println();
		}
	public static void selectionSort(int[] arr){
	{
		int i=0,j=0,max=Integer.MAX_VALUE;
		int temp=0;
		for(i=0;i<arr.length-1;i++)
		{
			max=i;
			for(j=i+1;j<arr.length;j++)
			{
					if(arr[max]<arr[j])
						max=j;
			}
			if(i!=max){
				temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
		}
	}
}
}
}