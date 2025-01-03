//WAP to display fibbonaki series of 10 numbers.

//(Means adding of previews 2 number. )
//always start with 0 and 1 and that should declare in code. 
package JavaProgramming;

import java.util.Iterator;

public class P11_Fibbonaci {

	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 1; i <= n - 2; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
