package demo;

import java.util.Stack;

public class BalancedBracket_12 {

	public static void main(String[] args) {
		System.out.println(isBalanced("(){}"));
		System.out.println(isBalanced("{)}"));
		System.out.println(isBalanced("{[()]}"));
		System.out.println(isBalanced("{[])"));
	}

	// O(N) 
	private static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);
			} else {
				if (st.empty()) {
					return false;
				}
				char latestOpenedPar = st.pop();
				if (latestOpenedPar == '{' && ch != '}') {
					return false;
				} else if (latestOpenedPar == '[' && ch != ']') {
					return false;
				} else if (latestOpenedPar == '(' && ch != ')') {
					return false;
				}
			}
		}
		return st.size() == 0;
	}

}
