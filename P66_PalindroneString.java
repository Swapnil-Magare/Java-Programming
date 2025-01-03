// WAP to check if the String is Palindrome or not.

// madam mam nitin level racecar.
package JavaProgramming;

public class P66_PalindroneString {

	public static void main(String[] args) {
		String n="madam";
		String rev=new String();
		for (int i = n.length()-1; i >=0; i--) {
			rev=rev+ n.charAt(i);
		}
		System.out.println(rev);
		if (n.equalsIgnoreCase(rev)) {
			System.out.println("Palimdrome");
			
		} else {
			System.out.println("Not a  Palindrone ");
		}
	}

}
