// WAP to find the value decimal to Hexadecimal.
// Decimal --> Base10 --> 10.
// Binary  --> Base2  --> 2.
// Octal   --> Base8  --> 8.
// HexaDecimal --> Base16 --> 16.
// Base16 --> divide decimal value by 16.
// logic : String hexa = "";
// logic : octal = remainder + hexa;
// ASCII value of char A start from 65.
package JavaProgramming;

import java.util.Scanner;

public class P35_decimalToAnyothernumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int base = sc.nextInt();

		// Inbuild Method : Integer.toBinaryString(value));
		System.out.println(Integer.toBinaryString(decimal));

		// Inbuild Method : Integer.toOctalString(value));
		System.out.println(Integer.toOctalString(decimal));

		// Inbuild Method : Integer.toHexString(value));
		System.out.println(Integer.toHexString(decimal));

		String AnyNumber = "";
		while (decimal != 0) {
			int remainder = decimal % base;
			if (remainder < 10) {
				AnyNumber = remainder + AnyNumber;
			} else {
				AnyNumber = (char) (remainder + 55) + AnyNumber;
			}
			decimal = decimal / base;
		}
		System.out.println(AnyNumber);
	}

}
