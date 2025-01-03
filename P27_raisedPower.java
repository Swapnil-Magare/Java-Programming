//WAP to calculate the number raised to power.


//
package JavaProgramming;

public class P27_raisedPower {

	public static void main(String[] args) {
		int n =5,pow = 3;
		int prod = 1;
		
		for (int i = 1; i <= pow; i++) {
//			prod *= n;
			prod = prod * n;
		}
		System.out.println(prod);
		System.out.println(Math.pow(5,3));
	}

}
