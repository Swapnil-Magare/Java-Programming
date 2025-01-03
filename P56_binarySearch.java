package JavaProgramming;
//WAP to find the Array element by binary Search in Ascending Order by using Insertion Sort.

import java.util.Scanner;

public class P56_binarySearch {
	public static void insertionSort(int[]a) {
		for (int i = 1; i < a.length; i++) {
			int temp =a[i];
			int j =i;
			while (j>0 && a[j-1]> temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
//		int a[]= {3,2,1,4,2,9};
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int []a =new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		insertionSort(a);
		System.out.println();
		
		System.out.println("Search Element :");
		int search = sc.nextInt();
		int startPoint = 0;
		int endPoint = a.length-1;
		
		while (startPoint <= endPoint) {
			
			int midPoint = (startPoint + endPoint)/2;
			
		if (search == a[midPoint]) {
			System.out.println("Present at index :"+ midPoint);
			break;
			
		} else if (a[midPoint] < search){
			startPoint =midPoint + 1;

		} else if(a[midPoint] > search) {
			endPoint =midPoint - 1;
		}
			
		}if (startPoint > endPoint) {
			System.out.println("Element is not presend");
		}
		
	}

}
