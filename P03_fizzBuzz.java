//Given a number n, for each integer i in the range from 1 to n inclusive, print out one value per line as follows:

//
//if i is a multiple of both 3 and 5, print FizzBuzz
//if i is a multiple of 3(but not 5), print Fizz
//if i is a multiple of 5(but not 3), print Buzz
//if i is not a multiple of 3 or 5, print the value of i
//
//Sample Input - 
//15
//
//Sample Output - 
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//Fizz
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz
package JavaProgramming;

import java.util.Scanner;

public class P03_fizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else
				System.out.println(i);
		}
	}

}

// Shortcut to popup up console 
//alt + shift +q then c
//window=>show view=>console (third option)
