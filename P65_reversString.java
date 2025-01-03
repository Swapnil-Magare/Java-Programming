package JavaProgramming;

import java.util.Scanner;
// WAP to print the String in Reverse Order.
public class P65_reversString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s= sc.nextLine();
		String rev="";
		for (int i =s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);	
	}

}
