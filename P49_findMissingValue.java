//Given an Array nums containing "n" distinct number in the range [0,n] 
//Return the only number in the range that is missing from the Array.

//input : [9, 2, 3, 4, 6, 0, 8, 1,5]
//output: 8

package JavaProgramming;

import java.util.Scanner;

public class P49_findMissingValue {

	public static void main(String[] args) {
//		int arr[] = { 9, 2, 3, 4, 6, 0, 8, 1,5 };
//		int n = 9;

		Scanner sc = new Scanner(System.in);
		int ne = sc.nextInt();
		int arr[] = new int[ne];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// int total = n*(n+1)/2;
		int total = 0;

		for (int i = 0; i <= ne; i++) {
			total = total + i;
		}
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println(total - sum);
	}

}
