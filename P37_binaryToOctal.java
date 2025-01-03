// WAP to convert Binary to Octal. 
//Here is no direct conversion between Binary to octal.
//for that you should convert it in Binary == Decimal == Octal.
package JavaProgramming;

public class P37_binaryToOctal {

	public static void main(String[] args) {
		int n = 11011;
		int sum = 0;
		int pow = 0;
		while (n != 0) {
			int digit  = n%10;
			sum = sum + digit *(int)Math.pow(2, pow);
			pow++;
			n = n/10;
		}
		String octal = "";
		while (sum != 0 ) {
			int remainder= sum %8;
			octal = remainder + octal;
			sum =sum/8;
		}
		System.out.println(octal);
	}

}
