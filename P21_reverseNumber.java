//WAP to Reverse the number.

//login : rev * 10 +digit
package JavaProgramming;

public class P21_reverseNumber {

	public static void main(String[] args) {
		int n=1567;
		int rev=0;
		
		while (n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}

}
