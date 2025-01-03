// WAP to convert the lowercase characters in string to uppercase characters 

// without using inbuilt methods .

// Input - java
// Output - JAVA
package JavaProgramming;

public class P70_LowerToUpparString {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(str);

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				result = result + (char) (ch - 32);

			} 
//			else if (ch >= 'A' && ch <= 'Z') {
//				result = result + (char) (ch - 'A' + 'a');
//			}
			else {
				result += ch;
			}
		}
		System.out.println(result);

	}
}
