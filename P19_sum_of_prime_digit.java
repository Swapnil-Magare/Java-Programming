//WAP to find the sum of all the prime Digits in number.


//prime number which divisible by itself OR 1.
package JavaProgramming;

public class P19_sum_of_prime_digit {

	public static void main(String[] args) {
		int n = 789;
		int sumprime = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit ==2 || digit ==3||digit ==5||digit ==7 ) {
				sumprime += digit;
				
			}
			n =n/10;
			}
		System.out.println(sumprime);
		

	}

}
