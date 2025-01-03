//WAP to find Factorial of a number using BigInteger.
package JavaProgramming;

import java.math.BigInteger;

import java.util.Scanner;

//Write a Program to find factorial of a number using Biginterger
public class P08_Factorial {
	public static void main(String[] args) {
//	int n=50;
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
