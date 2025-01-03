package JavaProgramming;

import java.util.Scanner;

public class P59_ {

	public static void main(String[] args) {
		
//		int[][] a = {{454,55,521,14}, {78,326,104,989},{23447,174,87,845},{25,81,53,11}};
//		int x = 104;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Outer Array Size : ");
		int m = sc.nextInt();
		System.out.println("Enter inner Array Size : ");
		int n = sc.nextInt();
		
		int [][]arr= new int [m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("index" + i + " " + j);
				arr[i][j] =sc.nextInt();
			}
		}
		
		//Display 2D array By using For loop.
		System.out.println("Display 2D array By using For loop.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Display 2D array By using ForEach loop.
		System.out.println("Display 2D array By using ForEach loop.");
		for (int []is : arr) {
			for (int is2 : is) {
				System.out.print(is2+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter Search Element : ");
		int x =sc.nextInt();
		
		//Sum of Row And Column.
		int sumRC = 0;
		chotu: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (x == arr[i][j]) {
					sumRC = i + j;
					break chotu;
				}
			}
		}
		System.out.println("Sum of row col : "+sumRC );
		
	
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (sumRC % 2 == 0 && arr[i][j] % 2 == 0) {
					
					System.out.println("Total sum of Even Element :" + arr[i][j]);
					totalSum = totalSum + sumOfDigits(arr[i][j]);
				
				} else if (sumRC % 2 != 0 && arr[i][j] % 2 != 0) {
					
					System.out.println("Total sum of odd Element :" + arr[i][j]);
					totalSum = totalSum + sumOfDigits(arr[i][j]);
				}
			}
		}
		System.out.println("Tatal sum :"+totalSum);

	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
}



