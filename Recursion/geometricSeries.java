package recursionPrac;

import java.util.Scanner;

public class geometricSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		double p=findGeometricSum(k);
		System.out.println(p);
	}
	public static double findGeometricSum(int k){
	    double p=0.5;
		if(k==0)
	    	return 1;
	    else if(k==1)
	    	return (1+p);
	    double s=findGeometricSum(k-1);
	    double ans=1+(s*0.5);
	    return ans;
	}

}
