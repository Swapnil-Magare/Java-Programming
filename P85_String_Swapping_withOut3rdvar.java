// WAP to swap two strings without using a third variable.

package JavaProgramming;

public class P85_String_Swapping_withOut3rdvar {

	public static void main(String[] args) {
		String s1 = "Swapnil";
		String s2 = "Magare";
		System.out.println("Before Swapping");
		System.out.println(s1);
		System.out.println(s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After Swapping");
		System.out.println(s1);
		System.out.println(s2);
	}

}
