package demo;

import java.util.Stack;

public class BalnceStringBrackets {

	public static void main(String[] args) {
		System.out.println(balanceBracket("{[]}"));
		System.out.println(balanceBracket("{)}"));
	}

	private static boolean balanceBracket(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;
				char latestOpenedPar = stack.pop();
				if (latestOpenedPar == '{' && ch != '}') {
					return false;
				} else if (latestOpenedPar == '(' && ch != ')') {
					return false;
				}
				else if (latestOpenedPar == '[' && ch != ']') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
