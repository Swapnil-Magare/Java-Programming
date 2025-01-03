// WAP to Print Array by 4 method.
package JavaProgramming;

public class P40_arrayPrint {

	public static void main(String[] args) {
		int array [] = {1,2,3,4,5,6};
		
		// Method 1: Using enhanced for loop
		for (int i : array) {
			System.out.print(i+ " ");
		}System.out.println();
		
		// Method 2: Using standard for loop
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}System.out.println();
		
		// Method 3: Using while loop
		int i = 0;
		while (i < array.length) {
			System.out.print(array[i]+ " ");
			i++;
		}System.out.println();
		
		// Method 4: Using do-while loop
		int j = 0;
		do {
			System.out.print(array[j]+ " ");
			j++;
		} while (j< array.length);
	}

}
