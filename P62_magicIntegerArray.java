package JavaProgramming;
//WAP to print sum of Magic Integer,
//Magic Value of an Array: The difference between the sum of "good" integers and the sum of "bad" integers in the array.
//Good Integer: An integer whose index remains the same after sorting the array.
//Bad Integer: An integer whose index changes after sorting the array.

public class P62_magicIntegerArray {
	public static void sort(int []arr) {
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

	public static void main(String[] args) {
		int arr[]= {0,0,4,1,0,0,7,8,3,9};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//using clone method for array copy.
		int b[]=arr.clone();
		sort(arr);
		System.out.println();
		
		int sumOfGooodInt=0;
		int sunOfBadInt=0;
		
		for (int i = 0; i < arr.length; i++) {
			
				if(arr[i]==b[i]) {
					sumOfGooodInt=sumOfGooodInt+arr[i];
				}else {
					sunOfBadInt=sunOfBadInt+arr[i];
				}
		}
		System.out.println(sumOfGooodInt-sunOfBadInt);
	}

}
