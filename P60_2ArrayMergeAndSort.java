package JavaProgramming;
// WAP to Merge 2 Different Array And Sort.
import java.util.Arrays;

import java.util.Scanner;

public class P60_2ArrayMergeAndSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[m + n];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0, j = a.length; i < b.length; i++, j++) {
			c[j] = b[i];
		}
		//Print the Merged 
		for (int i : c) {
			System.out.print(i + " ");
		}
		Arrays.sort(c);
		
		System.out.println("Merge Array and Sort Array :");
		for (int i : c) {
			System.out.print(i + " ");
		}
	}
}