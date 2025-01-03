// WAP to find the index of the first unique character in a string.

//Note : index Start from 1
package JavaProgramming;

public class P78_FirstUniqueCharacterIndex {

	public static void main(String[] args) {
		String s = "statistics";
		int index = -1;
		
		boolean[] b = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			
			if (b[i] == false) {
				int count = 1;
				
				for (int j = i + 1; j < s.length(); j++) {
					
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
				if (count == 1) {
					index = i + 1;
					break;
				}
			}

		}
		System.out.println("index " +index);
	}

}
