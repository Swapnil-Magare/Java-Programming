// WAP a find the number is Prime OR notPrime.


// Divisible by itSelf OR 1
package JavaProgramming;

public class P05_PrimeNumber {
	public static void main(String[] args) {
		int n = 12;
		int count = 1;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime Number");
		} else
			System.out.println("not a prime Number");
	}

}
