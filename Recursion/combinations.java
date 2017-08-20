import java.util.Scanner;

public class combinations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=s.nextInt();
		String[] ans=allStrings(str, n);
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
	}
	public static String[] allStrings(String charset,int len){
		String[] prevoutput=new String[1];
		prevoutput[0]="";
		
		for(int i=1;i<=len;i++){
			String output[]=new String[prevoutput.length*charset.length()];
			int l=0;
			for(int j=0;j<charset.length();j++){
				for(int k=0;k<prevoutput.length;k++){
					output[l]=prevoutput[k]+charset.charAt(j);
					l=l+1;
				}
			}
			prevoutput=output;
		}
		return prevoutput;
	}

}
