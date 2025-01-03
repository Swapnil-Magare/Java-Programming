// WAP to find the value decimal to Octal.

// Base8 --> divide decimal value by 8.
// logic : String octal = "";
// logic : octal = remainder + octal;
package JavaProgramming;

public class P33_decimalToOctal {

	public static void main(String[] args) {
		int decimal =30;
		
		//Inbuild Method  : Integer.toOctalString(value));
		System.out.println(Integer.toOctalString(decimal));
		
		String octal = "";
		while (decimal != 0) {
			int remainder = decimal%8;
			octal = remainder + octal;
			decimal=decimal/8;
		}
		System.out.println(octal);
		
	}

}
