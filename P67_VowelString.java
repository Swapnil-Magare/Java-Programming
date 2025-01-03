// WAP to find total number of vowels present in the String.
package JavaProgramming;

import java.util.Scanner;

public class P67_VowelString {

	public static void main(String[] args) {
		String str = "AEIOUaeiou";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {

				count++;
			}

		}
		System.out.println(count);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str2 = sc.nextLine();

		int vowelCount = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		char[] characters = str2.toCharArray();

		for (char ch : characters) {
			for (char vowel : vowels) {
				if (ch == vowel) {
					vowelCount++;
				}
			}
		}
		System.out.println("Total number of vowels: " + vowelCount);
	}

}
