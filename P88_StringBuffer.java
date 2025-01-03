// WAP to demonstrate the difference between String (immutable) and StringBuffer (mutable).

package JavaProgramming;

public class P88_StringBuffer {

	public static void main(String[] args) {
		String s="Qspider ";
		s.concat("Thane"); //Immutable
		System.out.println(s);
		
		StringBuffer str=new StringBuffer("Jspider ");
		str.append("Thane"); //Mutable
		System.out.println(str);
		
		
		}

}
