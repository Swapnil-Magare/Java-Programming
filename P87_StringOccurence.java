// WAP to find and display the occurrence of each word in a given string.

package JavaProgramming;
public class P87_StringOccurence {

	public static void main(String[] args) {
		String s1 = "Tim is playing in house Tim is a good kid Tim";

		String[] arr = s1.split(" ");
		boolean[] b = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (b[i] == false) {
				int count = 1;

				for (int j = i + 1; j < arr.length; j++) {
					
					if (arr[i].equals(arr[j])) {
						count++;
						b[j] = true;
					}
				}

				System.out.println(arr[i] + " " + count);
			}
		}
	}

}
