package JavaProgramming;
//WAP to Copy Array element by using 4 Techniques

//1. using for loop
//2. using Arrays.copyOf(original arr, size);
//3. using System.arraycopy(src,srcIndex,dest,destIndex,size);
//4. using clone()
import java.util.Arrays;

public class P57_copyArrayMethod {
	public static void main(String[] args) {

		// 1. using for loop
		int[] a = { 0, 0, 4, 1, 0, 0, 7, 8, 3, 9 };
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		// Print the result of the for loop copying
		System.out.println("For loop copy: " + Arrays.toString(b));
		// -------------------------------------------------------------------------------------------------------------------------------------

		// 2. using Arrays.copyOf(original arr, size);
		int[] aa = { 0, 0, 4, 1, 0, 0, 7, 8, 3, 9 };
		int[] bb = Arrays.copyOf(aa, aa.length);
		// Print the result of Arrays.copyOf
		System.out.println("Arrays.copyOf: " + Arrays.toString(bb));
		// -------------------------------------------------------------------------------------------------------------------------------------

		// 3. using System.arraycopy(src,srcIndex,dest,destIndex,size);
		int[] arr = { 0, 0, 4, 1, 0, 0, 7, 8, 3, 9 };
		int[] brr = new int[arr.length];
		System.arraycopy(arr, 0, brr, 0, arr.length);
		// Print the result of System.arraycopy
		System.out.println("System.arraycopy: " + Arrays.toString(brr));
		// -------------------------------------------------------------------------------------------------------------------------------------

		// 4. using clone()
		int[] array = { 0, 0, 4, 1, 0, 0, 7, 8, 3, 9 };
		int[] brray = array.clone();
		// Print the result of clone
		System.out.println("Clone: " + Arrays.toString(brray));
		// -------------------------------------------------------------------------------------------------------------------------------------

	}

}
