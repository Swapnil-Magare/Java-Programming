package JavaProgramming;

public class P38_binaryToHexaDecimal{

	public static int power(int n,int pow) {
		int res= 1;
		for (int i = 1; i <= pow; i++) {
			res = res * n;
		}
		return res;
	}
	
	public static String deciToHexa(int decimal) {
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
		return hexa;	
	}

	public static void main(String[] args) {
		int binary =11011;
		int decimal = 0;
		int pow = 0;
		int temp = binary;
		while (binary != 0) {
			int digit = binary % 10;
			decimal =decimal +digit * power(2,pow);
			pow++;
			binary=binary/10;
			
			
		}
		binary = temp;
		String hexa = deciToHexa(decimal);
		
		System.out.println(binary);
		System.out.println(decimal);
		System.out.println(hexa);
	}

}
