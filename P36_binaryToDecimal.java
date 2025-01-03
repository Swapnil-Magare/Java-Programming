// WAP to convert Binary TO Decimal.

// logic : 
//

package JavaProgramming;

public class P36_binaryToDecimal{
	
	public static int power(int n,int pow) {
		int res= 1;
		for (int i = 1; i <= pow; i++) {
			res = res * n;
		}
		return res;
	}

	public static void main(String[] args) {
		int n =11011;
		int sum = 0;
		int pow = 0;
		int temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum =sum +digit * power(2,pow);
			pow++;
			n =n/10;
			
			
		}
		n = temp;
		System.out.println(n);
		System.out.println(sum);
	}

}
