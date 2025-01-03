// WAP to create Random Password using upto 5 Character.
package JavaProgramming;

import java.util.Random;

public class P72_RandomPassword {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLIMNOPQRSTUVWXYZ";
		String password="";
		Random r=new Random();
		
		while (password.length()<5) {
			int random =r.nextInt(str.length());	
			char ch =str.charAt(random);
			password =password +ch;
		}
		System.out.println(password);
	}

}
