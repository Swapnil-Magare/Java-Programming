// WAP to find the Strong number in range 1 to 1000.

// logic : Apply digit separation login.
// then find number is Strong or not by loop until 1000.
// sum of Factorial = original number.
package JavaProgramming;

public class P30_rangIsStrongNumber {
	public static boolean isStrongNumber(int n) {
		
		int sum = 0,temp = n;
		
		while (n != 0) {
			
			int digit = n %10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
			fact *= i;			
			}
			sum = sum + fact ;
			n = n /10;
		}
		return (temp == sum);
	}

	public static void main(String[] args) { 
		for (int n = 1; n < 1000; n++) {
			if (isStrongNumber(n)) {
				System.out.println(n);	
			}
			
		}
	}

}
