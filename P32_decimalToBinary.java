// WAP to convert Decimal to Binary value.

// Logic : String binary = ""; 
// logic : binary = remainder + binary;
package JavaProgramming;

public class P32_decimalToBinary{

	public static void main(String[] args) {
		int decimal =36;
		
		//Inbuild Method  : Integer.toBinaryString(value));
		System.out.println(Integer.toBinaryString(decimal));
		
		String binary = "";
		while (decimal != 0) {
			int remainder = decimal%2;
			binary = remainder + binary;
			decimal=decimal/2;
		}
		System.out.println(binary);
		
	}

}
