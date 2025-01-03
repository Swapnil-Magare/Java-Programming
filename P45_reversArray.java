// WAP to reveres the Array element.

// method 3 is preferable.


package JavaProgramming;

import java.util.Iterator;

public class P45_reversArray{

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		// Method 1
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// Method 2
		int a[] = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			a[j] = arr[i];
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

//		Method 3
		int i = 0, j = arr.length-1;
		while (i < arr.length / 2) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
			i++;
		}
		for (int k : a) {
			System.out.print(k + " ");
		}

	}

}
