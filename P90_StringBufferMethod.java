// WAP to demonstrate the usage of various StringBuffer methods: append, insert, replace, delete, deleteCharAt, and reverse.

package JavaProgramming;

public class P90_StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java Prog");
		System.out.println(sb);
		sb.append(" lang");
		System.out.println(sb);

		sb.insert(4, " is a");
		System.out.println(sb);

		sb.replace(10, 14, " programming");
		System.out.println(sb);

		sb.delete(5, 9);
		System.out.println(sb);

		sb.deleteCharAt(5);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
