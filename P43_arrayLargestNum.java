// WAP to find the largest number of array.
package JavaProgramming;

public class P43_arrayLargestNum {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 5, 6, 7, 37, 8, 8, 44 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
