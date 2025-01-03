// WAP to remove all spaces from the string.

// Input - java is a programming language
// Output - javaisaprogramminglanguage
package JavaProgramming;

import java.util.Scanner;

public class P69_RemoveSpaceString{

	public static void main(String[] args) {
//		String str="java is a programming language";
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ') {
                result+=ch; 
            }
        }

        System.out.println(result);
        
	}
}
