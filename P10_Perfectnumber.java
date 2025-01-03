//
package JavaProgramming;

import java.util.Scanner;

public class P10_Perfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) // for(int i=1;i<n;i++)
		{
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("Perfect NUmber");
		} else
			System.out.println("Not a Perfect Number");
	}
}
