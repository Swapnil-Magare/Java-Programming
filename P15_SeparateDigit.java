// WAP to separate each digit from given number.
package JavaProgramming;

public class P15_SeparateDigit  {

	public static void main(String[] args) {
		int n =8342;
		while (n != 0) {
			int digit = n % 10;
			System.out.print(digit + " ");
			n=n/10;
		}

	}

}
