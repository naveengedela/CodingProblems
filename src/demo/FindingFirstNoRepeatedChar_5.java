package demo;

import java.util.HashMap;
import java.util.Map;

public class FindingFirstNoRepeatedChar_5 {

	public static void main(String[] args) {
		String str = "";

		System.out.println(firstNonRepeatedCharacter(str));

	}

	private static Character firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (result.containsKey(ch)) {
				result.put(ch, result.get(ch) + 1);
			} else {
				result.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry: result.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return Character.MIN_VALUE;
//		return (int) Character.MIN_VALUE; // It will print 0 as there is no first no repeated char
	}

}
