//WAP to find the sum of all Digits in the number.

package JavaProgramming;

import java.util.Scanner;

public class P16_sumofall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int digit = n%10;
			System.out.print(digit + " ");
			n = n/10;
			sum = sum + digit;
		}
		System.out.println( "sum of all digit : " +sum);
	}

}
