// WAP to print Even Number from Array.
package JavaProgramming;

public class P41_arrayEven {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,4,5,4,2,};
		
		for (int i : arr) {
		if (i % 2==0) {
			System.out.println(i);
		}
		}
	}
}
