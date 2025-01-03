//Find the product of all odd number in range 1to 10.
package JavaProgramming;

public class P06_Product_odd {
	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				product *= i;
//			product =product*i;
			}
		}
		System.out.println(product);
	}
}
