// WAP to check if two strings are anagrams of each other.

package JavaProgramming;

import java.util.Arrays;

public class P73_AnaGramString {

	public static void main(String[] args) {
		String str1="cat".toLowerCase().replace(" ", "");
		String str2="aet".toLowerCase().replace(" ","");
		
		if (str1.length()==str2.length()) {
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean isAnagram=true;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i]!=ch2[i]) {
					isAnagram=false;
					break;
				}
			}
			
			//Method::
//			boolean isAnagram=Arrays.equals(ch1, ch2);
			
			if (isAnagram) {
				System.out.println("Anagram");
			} 
			else {
				System.out.println("Not an Anagram.");
			}
		} else {
			System.out.println("not an Anagram length is not Same!!!!!!!");

		}
	}

}
