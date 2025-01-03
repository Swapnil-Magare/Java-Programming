//WAP to get input form user And check whether the number is ArmStrong OR Not.
//
package JavaProgramming;

import java.util.Scanner;

public class P29_armstrongScannerNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int originalNumber = number;
	        int result = 0;

	        // Calculate the number of digits
	        int digits = 0;
	        while (number != 0) {
	            number /= 10;
	            digits++;
	        }

	        // Reset the number to the original value
	        number = originalNumber;

	        // Calculate the sum of the digits raised to the power of the number of digits
	        while (number != 0) {
	            int digit = number % 10;
	            result += Math.pow(digit, digits);
	            number /= 10;
	        }

	        if (result == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }
	}
