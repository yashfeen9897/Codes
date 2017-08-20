package StringUse;

import java.util.Scanner;

public class minlen {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        System.out.print(minLengthWord(str));
	}
	 public static String minLengthWord(String input){
	    		
	        input=input+" "; 
	        int len=input.length(); 
	        String x="",minw="";
	        char ch;
	        int p,minl=len,maxl=0;
	 
	        for(int i=0;i<len;i++)
	        {
	            ch=input.charAt(i);
	            if(ch!=' ')
	            {
	                x=x+ch;
	            }
	            else
	            {
	                p=x.length();
	 
	                if(p<minl) 
	                {
	                    minl=p;
	                    minw=x;
	                }
	 
	                if(p>maxl) 
	                {
	                    maxl=p;
	                }
	                x=""; 
	            }
	        }
	        return minw;
	    }
}
