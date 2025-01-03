//WAP to find the number is Armstrong OR not By Method.
package JavaProgramming;

import java.util.Iterator;

public class P28_byMethodArmStrong {
	
	public static boolean isArmstrong(int n,int count) {
		int sum=0; int temp=n;
		while(n!=0) {
			int d=n%10;
			sum+=Math.pow(d,count);
			n/=10;
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		int count=0;
		int n=153;
		int temp=n;
		while(n!=0) {
			count++;
			n/=10;
		}
		boolean res=isArmstrong(temp,count);
		System.out.println(res);
	}
}
