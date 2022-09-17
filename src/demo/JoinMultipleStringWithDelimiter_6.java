package demo;

import java.util.StringJoiner;

public class JoinMultipleStringWithDelimiter_6 {

	public static void main(String[] args) {
		String str = "Java And Ruby";
		String ch = "-";

		System.out.println(joinMultipleWithDelimiter(ch, str));

	}

	private static String joinMultipleWithDelimiter(String ch, String str) {
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		String loopDelim = "";
		
		for(String word: strArr) {
			sb.append(loopDelim);
			sb.append(word);
			loopDelim = ch;
		}
		
		return sb.toString();

	}

}
