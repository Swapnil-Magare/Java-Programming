// WAP that checks if the given string of brackets is valid.
// The string is valid if all types of brackets {}, [], and () are correctly nested and matched.
package JavaProgramming;

import java.util.Stack;

public class P79_BracketValidator {

	public static void main(String[] args) {
		String str = "}{(){[]}}{";
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '{' || ch == '[' || ch == '(') {
				stk.push(ch);
			} else if (stk.empty()) {
				System.out.println("Invalid");
				return;
			} else {
				char pop = stk.pop();
				switch (pop) {
				case '(':
					if (ch != ')') {
						System.out.println("invalid");
						return;
					}
					break;
				case '{':
					if (ch != '}') {
						System.out.println("invalid");
						return;
					}
					break;
				case '[':
					if (ch != ']') {
						System.out.println("invalid");
						return;
					}
					break;
				}

			}

		}
		if (stk.size() == 0) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}

}
