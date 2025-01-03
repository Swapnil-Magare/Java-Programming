// WAP to reverse the order of words in a given string.

package JavaProgramming;

import java.util.Iterator;

public class P82_ReverseStringWord{

	public static void main(String[] args) {
		String str="java is a Programming language";
		String arr[]=str.split(" ");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
