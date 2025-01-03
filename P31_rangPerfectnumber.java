// WAP to find the perfect number in range 1 to 1000.

// logic : Apply digit separation login.
// then find number i Perfect or not by loop until 1000.
// sum of Factor = original number.

package JavaProgramming;

public class P31_rangPerfectnumber {
	public static boolean isPerfectNumber(int n) {
		int sum=0;
		for(int i=1; i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return n==sum;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if(isPerfectNumber(i)) {
				System.out.println(i);
			}
			
		}
	}

}
