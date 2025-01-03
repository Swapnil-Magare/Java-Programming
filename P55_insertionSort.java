package JavaProgramming;
//WAP to print all element in Ascending Order by using Insertion Sort.

import java.util.Scanner;

public class P55_insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array length : ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
//		int []arr= {5,3,7,2,9,1};
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j=i;
			while (j>0 && arr[j-1] > temp) {
				
				arr[j]= arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
