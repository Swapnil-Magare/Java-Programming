//WAP to find Factorial of a number using BigInteger.
package JavaProgramming;

import java.math.BigInteger;
import java.util.Scanner;

public class P12_factorialuserinput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) {
			BigInteger x = BigInteger.valueOf(i);
			fact = fact.multiply(x);
		}
		System.out.println(fact);
	}

}
