// WAP to check if a given string is a pangram (contains all the letters of the English alphabet at least once).

package JavaProgramming;

public class P74_PangramSting {
	
	public static void main(String[] args) {
		
		        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
		        
		        boolean[] alphabetPresent = new boolean[26];
		        
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		           
		            if (ch >= 'a' && ch <= 'z') {
		                int index = ch - 'a';
		                alphabetPresent[index] = true;
		            }
		        }
		        
		        boolean isPangram=true;
		        for (int i = 0; i < alphabetPresent.length; i++) {
		            if (alphabetPresent[i]==false) {
		                isPangram= false;
		                }
		        }
		        
		        if (isPangram) {
		            System.out.println("The string is a pangram.");
		        } else {
		            System.out.println("The string is not a pangram.");
		        }
		    
		}

	}
