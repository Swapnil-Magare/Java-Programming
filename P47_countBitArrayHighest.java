// WAP to count the bit of number and display the highest bit number.


// 
package JavaProgramming;

public class P47_countBitArrayHighest {

	public static int countSetBits(int n) {
		int count = 0;
		while (n != 0) {
			int remainder = n % 2;
			if (remainder == 1) {
				count++;
			}
			n = n / 2;
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 100, 1000, 10000 };

		int maxSetBits = 0;
		int maxNumber = 0;

		for (int i = 0; i < arr.length; i++) {
			// Predefind Method in JAva
//-----------int setBitcount = Integer.bitCount(arr[i]);

			int setBitCount = countSetBits(arr[i]);

			if (setBitCount > maxSetBits) {
				maxSetBits = setBitCount;
				maxNumber = arr[i];
			}

		}
		System.out.println(maxSetBits);
		System.out.println(maxNumber);
	}
}