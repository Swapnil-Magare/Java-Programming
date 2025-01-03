package JavaProgramming;

public class P20_Sumofallby_loop {

	public static void main(String[] args) {
		int n = 2345;
		int sumprime = 0;
		
		while (n != 0) {
			int digit = n%10;
			int count = 0;
			
			for (int i = 0; i < digit/2; i++) {
				if(digit %i == 0) {
					count++;
				}
			}
			if (count ==2) {
				sumprime += digit;
			}
			n = n/10;
		}
		System.out.println(sumprime);
	}

}
