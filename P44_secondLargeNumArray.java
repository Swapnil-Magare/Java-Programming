// WAP to 2nd largest number from the Array.
// Compare the value by each other.
// use java.lang.Integer.MIN_VALUE :  integer : -2147483648 
package JavaProgramming;

public class P44_secondLargeNumArray {

	public static void main(String[] args) {
		int arr[] = {1,65,65,5,5,6 };
		int largest = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;

		
		for (int i : arr) {
			if (i > largest) {
				slarge = largest;
				largest = i;
			} else if (i > slarge && i != largest) {
				slarge = i;
			}
		}
		System.out.println("largets number : " + largest);
		System.out.println("Second large : " + slarge);
	}
	
}
