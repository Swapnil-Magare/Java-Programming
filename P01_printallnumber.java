// Write a program to print all the numbers from 1 to 5.

package JavaProgramming;

public class P01_printallnumber {

	public static void main(String[] args) {
		System.out.println("==================For Loop==================");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("===============do while Loop================");
		int x = 1;
		do {
			System.out.println(x);
			++x;
		} while (x <= 5);

	}

}
