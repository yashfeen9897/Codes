package l9;

import java.util.Scanner;
import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
			mergeSort(a);
			print(a);
	}
	
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] input){
		if(input.length == 1){
			return;
		}
		int mid;
		int ans[] = new int [input.length];
			mid=(input.length+1)/2;
			int a[] = new int[mid];
			for(int i=0;i<mid;i++){
				a[i]=input[i];
			}
			int b[] = new int[input.length-mid];
			for(int j=0;j<input.length-mid;j++){
				b[j]=input[j+mid];
			}
			mergeSort(a);
			mergeSort(b);
			ans=merge(a, b);
			for(int i=0;i<input.length;i++){
				input[i]=ans[i];
			}
			
	}
	
	public static int[] merge(int[] a,int [] b){
		int i=0,j=0,k=0;
		int c[]=new int[a.length+b.length];
		for(i=0,j=0;i<a.length && j<b.length;){
				if(a[i]<b[j]){
					c[k]=a[i];
					k++;
					i++;
				}
				else if(a[i]>b[j]){
					c[k]=b[j];
					k++;
					j++;
				}
				else if(a[i]==b[j]){
					c[k]=a[i];
					k++;
					i++;
					c[k] = b[j];
					k++;
					j++;
					
				}
		}
				if(i==a.length){
					for(int l=k;l<c.length;l++){
						c[l] = b[j];
						j++;
					}
					}
				else if(j==b.length){
					for(int l=k;l<c.length;l++){
						c[l] = a[i];
						i++;
					}
				}
				return c;
	}

}
