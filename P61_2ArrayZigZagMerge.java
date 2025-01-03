package JavaProgramming;
// WAP to Merge 2 different Array in Zig-Zag Pattern. 
import java.util.Scanner;

public class P61_2ArrayZigZagMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        
		        // Input sizes for both arrays
		        int m = sc.nextInt();
		        int n = sc.nextInt();
		        
		        // Input array a
		        int[] a = new int[m];
		        for (int i = 0; i < m; i++) {
		            a[i] = sc.nextInt();
		        }

		        // Input array b
		        int[] b = new int[n];
		        for (int i = 0; i < n; i++) {
		            b[i] = sc.nextInt();
		        }

		        // Determine size of result array
		        int minLength = Math.min(m, n);
		        int[] c = new int[m + n];
		        
		        // Zig-zag merge
		        int index = 0;
		        for (int i = 0; i < minLength; i++) {
		            c[index++] = a[i]; // Add element from array a
		            c[index++] = b[i]; // Add element from array b
		        }

		        // If array a has more elements
		        for (int i = minLength; i < m; i++) {
		            c[index++] = a[i];
		        }

		        // If array b has more elements
		        for (int i = minLength; i < n; i++) {
		            c[index++] = b[i];
		        }

		        // Print the Zig-Zag Merged Array
		        System.out.println("Zig-Zag Merged Array:");
		        for (int i : c) {
		            System.out.print(i + " ");
		        }
		    }



}
