// WAP to reverse each word in a given string while maintaining the word order.

package JavaProgramming;

import java.util.Iterator;

public class P83_ReverseWordString {

	public static void main(String[] args) {
		String str="java is a Programming language";
		String arr[]=str.split(" ");
		
		for (int i = 0; i <arr.length; i++) {
			String rev="";
			String result =arr[i];
			
			for (int j = result.length()-1; j >=   0; j--) {
				char ch =result.charAt(j);
				rev=rev+ch;
			}
			System.out.println(rev);
		}
		
		}

}
