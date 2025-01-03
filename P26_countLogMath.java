//WAP a program to count the digit by using Math class

// Math.log10(n) +1;
package JavaProgramming;

public class P26_countLogMath {

	public static void main(String[] args) {
		int n = 1555555554;
		int count  = (int)(Math.log10(n) +1);
		System.out.println(count); 
//		int count = 0;
//		while (n != 0) {
//			count++;
//			n = n/10;
//			
//		}
	}

}
