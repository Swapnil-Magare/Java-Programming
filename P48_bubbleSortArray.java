// WAP to arrange the Element in Ascending Order by using.

// Sorting Method.
//Bubble sort Method : Use Nested loop. 
package JavaProgramming;

import java.util.Scanner;

public class P48_bubbleSortArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 3, 2, 6, 44, 75, 8 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
