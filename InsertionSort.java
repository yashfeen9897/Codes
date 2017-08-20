package inputoutput;

import java.util.Scanner;

public class InsertionSort {
	
		public static void main(String[] args) {
			int a[]=takeInput();
			insertionSort(a);
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
		public static void insertionSort(int[] arr){
			int i=0,j=0,k=0;
			for(i=1;i<arr.length;i++){
				k=arr[i];
				for(j=i-1; j>=0 && k<arr[j]; j--)
					arr[j+1]=arr[j];
				arr[j+1]=k;
			}
			printArray(arr);
		}
}