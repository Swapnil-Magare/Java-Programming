// WAP to print all the Prime number from the array.

//get the value from array and check it in method and print it.

package JavaProgramming;

public class P42_arrayPrimeNum {
	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7 };
		for (int i : arr) {
			if (isPrime(i)) {
				System.out.println(i);
			}

		}
	}

}
