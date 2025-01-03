package JavaProgramming;
//Factors means a number which divisible which numbers

//36 ==> 1,2,3,4,6,9,12,18,38
import java.util.Scanner;

public class P04_Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <= n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

}
