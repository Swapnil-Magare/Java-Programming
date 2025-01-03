// WAP to find the value decimal to Hexadecimal.

// Base16 --> divide decimal value by 16.
// logic : String hexa = "";
// logic : octal = remainder + hexa;
// ASCII value of char A start from 65.
package JavaProgramming;

import java.util.Scanner;

public class P34_decimalToHexaDecimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int decimal =sc.nextInt();
		
		//Inbuild Method  : Integer.toHexString(value));
		System.out.println(Integer.toHexString(decimal));

		String hexa = "";
		while (decimal != 0) {
			int remainder = decimal%16;
			if (remainder < 10) {
				hexa = remainder + hexa;
			} else {
				hexa =(char)(remainder+55)+hexa;
			}
			decimal=decimal/16;
		}
		System.out.println(hexa);	
	}

}
