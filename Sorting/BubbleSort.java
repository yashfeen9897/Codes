package inputoutput;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]=takeInput();
			bubbleSort(a);
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
	public static void bubbleSort(int[] arr){
		{
			int i=0,j=0,temp=0;
			for(i=0;i<arr.length-1;i++){
				for(j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
	}
}
