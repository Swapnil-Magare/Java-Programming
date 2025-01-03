//WAP to find the number is Palindrome OR not.


//Example 121 == 121 is palindrome number.
package JavaProgramming;

import java.util.Scanner;

public class P23_Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int revers=0;
		int temp = n;
		
		while (n!=0) {
			int digit=n%10;
			revers=revers*10+digit;
			n=n/10;
		}
		System.out.println(revers);
		
		if (temp ==revers) {
			System.out.println("Palindrome");
			
		} else {
			System.out.println("not Palindrome");

		}
	}

}
