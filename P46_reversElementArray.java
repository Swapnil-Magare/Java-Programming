// WAP to  reverse the Element present in the Array.

//input -15,74,63,14,25
//output - 51,47,36,41,52
// use reverse order logic.
package JavaProgramming;

public class P46_reversElementArray {

	public static void main(String[] args) {
		int arr[] = { 15, 74, 63, 14, 25 };
		for (int i : arr) {
			int rev=0;
			while (i!=0) {
				int digit=i%10;
				rev=rev*10+digit;
				i=i/10;
			}
			System.out.print(rev + " ");
		}
	}

}
