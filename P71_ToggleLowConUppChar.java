// WAP to find the toggle of the string where lowercase characters converted in uppercase and uppercase characters converted in lowercase.
// Input - HeLlO WoRLD
// Output - hElLo wOrld 
package JavaProgramming;

public class P71_ToggleLowConUppChar {

	public static void main(String[] args) {
		String str = "HeLlO WoRLD"; 
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			} else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		String result = new String(ch);
		System.out.println(result);
		
		
		
//		String str2 = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				str2 = str2 + (char) (ch - 'a' + 'A');
//
//			} else if (ch >= 'A' && ch <= 'Z') {
//				str2 = str2 + (char) (ch - 'A' + 'a');
//			}
//
//			else {
//				str2 = str2 + ch;
//			}
//		}
//		System.out.println(str2);
	}

}
 