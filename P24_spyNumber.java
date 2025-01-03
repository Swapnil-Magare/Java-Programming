//WAP to find the Number is Spy number OR not 
//Addition and Multiplication is Equal. 
//Sum == Product 
package JavaProgramming;

import java.util.Scanner;

public class P24_spyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int product = 1;

		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			product *= digit;
			n = n / 10;
		}
		if (sum == product) {
			System.out.println("Spy Number");
		} else {
			System.out.println("not a Spy Number");
		}

	}

}
