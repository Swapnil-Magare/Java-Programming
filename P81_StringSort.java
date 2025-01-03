// WAP to print all the String from the Array in Lexographical Order (Alphabetical Order)without using sort
package JavaProgramming;

import java.util.Arrays;

public class P81_StringSort {

	public static void main(String[] args) {
		String[] arr = { "welcome", "Goa", "hi", "Singham" ,"bye"};
						
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}
		}
//		Arrays.sort(arr);

		for (String s : arr) {
			System.out.println(s);
		}
	}

}
