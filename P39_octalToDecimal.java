// WAP to convert Octal to Decimal number.

// 
//
package JavaProgramming;

public class P39_octalToDecimal {
	
	public static void main(String[] args) {

		int octal = 36;
		int decimal = 0;
		int base = 1;
		
		while (octal != 0 ) {
			int digit = octal%10;
			decimal += digit * base;
			base *= 8;
			octal/=10;
		}
		System.out.println(decimal);
	}

}
