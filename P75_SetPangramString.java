// WAP to check if a given string is a pangram using a TreeSet to track unique alphabets.

package JavaProgramming;

import java.util.TreeSet;

public class P75_SetPangramString{

	public static void main(String[] args) {
		 String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
		 
		 TreeSet <Character> alpha=new TreeSet<>();
		 for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if (ch >='a'&&ch<='z') {
				alpha.add(ch);
			}	
		}
		 System.out.println(alpha);
		 
		 if (alpha.size()==26) {
			System.out.println("Panagram");
		} else {
			System.out.println("not a Panagaram");
		}
		 
	}

}
