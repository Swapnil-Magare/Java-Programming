package JavaProgramming;

// Array Operations : Total number of Decrement operation performed.
public class P50_totalDecrementArray {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 12, 16, 25 };
		int k = 6;
		int totalDecrement = 0;

		// Method 1
		for (int i = 0; i < arr.length; i++) {
			totalDecrement = totalDecrement + (arr[i] % k);
		}

		// Method 2

//		 for (int i = 0; i < arr.length; i++) {
//		 while (arr[i] % k != 0) {
//		 arr[i]--;
//		 totalDecrement++; } }

		System.out.println(totalDecrement);
	}

}
