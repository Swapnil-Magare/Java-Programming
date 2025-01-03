// WAP to remove all the vowels from the string.

// Input - education
// Output - dctn
package JavaProgramming;

public class P68_RemoveVowelString {

	public static void main(String[] args) {
		String str = "education";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I'
					&& str.charAt(i) != 'O' && str.charAt(i) != 'U') {
				str2 = str2 + str.charAt(i);
			}

		}
		System.out.println(str);
		System.out.println(str2);
	}

}
