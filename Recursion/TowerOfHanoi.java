package recursionPrac;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char source,auxiliary,destination;
		source=s.next().charAt(0);
		auxiliary=s.next().charAt(0);
		destination=s.next().charAt(0);
		int t=towerOfHanoi(n,source,auxiliary,destination);
		System.out.println(t);
	}
	public static int towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==0){
			return 0;
		}
		if(disks==1){
			return 1;
		}
		int s=towerOfHanoi(disks-1,source,destination,auxiliary);
		int ans=towerOfHanoi(disks-1,auxiliary,source,destination)+s+1;
		 return ans;
	}

}
