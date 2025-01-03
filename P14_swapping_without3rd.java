//WAP to swap 2 number without using 3rd variable.
package JavaProgramming;

public class P14_swapping_without3rd {

	public static void main(String[] args) {
		int a = 3, b = 4;
		System.out.println("Before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
