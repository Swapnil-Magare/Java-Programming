// WAP to count the occurrences of one string within another string using the `contains` method.

package JavaProgramming;

public class P86_StringContains{

	public static void main(String[] args) {
		String s1 = "TimisplayinginhouseTimisagoodkidTim";
		String s2 = "Tim";
		int count = 0;

		while (s1.contains(s2)) {
			count++;

			int x = s1.indexOf(s2) + s2.length();
			s1 = s1.substring(x);
		}
		System.out.println(count);
	}
}