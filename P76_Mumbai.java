// WAP to separate letters and digits from a string, 
// then print the length of the letters, the letters, and the sum of the digits.
package JavaProgramming;

public class P76_Mumbai{

	public static void main(String[] args) {
		String str="MU1M2B3A4I";

		String str2="";
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if (ch>='A' && ch<='Z') {
				str2= str2+ch;
			}
			
			if(ch>='0' && ch<='9') {
				int x=ch-'0';
				sum =sum +x;
			}
			
			
		}
		System.out.println(str2.length()+str2+sum);
	}

}
