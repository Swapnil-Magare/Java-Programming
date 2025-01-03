//WAP to find the number is Strong number OR not a Strong Number.

//Sum of factorial of Each digit. 
package JavaProgramming;

import java.util.Scanner;

public class P25_strongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ,temp = n ;
		while (n != 0) {
			
			int digit = n %10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
			fact *= i;			
			}
			sum = sum + fact ;
			n = n /10;
		}
		if (temp == sum) {
			System.out.println("Strong Number.");
			
		} else {
			System.out.println("Not a Strong Number.");
		}
		
		

	}

}