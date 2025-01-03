// WAP to swap two strings using a third variable.

package JavaProgramming;

public class P84_String_Swapping_with3rdvar {

	public static void main(String[] args) {
		String s1="Swapnil";
		String s2="Magare";
		System.out.println("Before Swapping");
		System.out.println(s1);
		System.out.println(s2);
		
		String temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("After Swapping");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
