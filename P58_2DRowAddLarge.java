package JavaProgramming;
// WAP to Addition of each row element. And find the Largest of each row element.of 2D Array

public class P58_2DRowAddLarge {

	public static void main(String[] args) {
		int [][]arr = {{1,222,3},
						{444,5,6},
						{7,44 ,8,9}};
	
		//Addition of each row element.
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println("Sum of each row Array element :"+sum);
		}
		System.out.println("------------------------------------------ ");
		//Largest of each row element.
		for (int i = 0; i < arr.length; i++) {
			int large = Integer.MIN_VALUE;
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] > large) {
					 large = arr[i][j];
				}
			}System.out.println("largest of Each Array element : "+large);
		}
		
	}

}
