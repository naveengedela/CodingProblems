package demo;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChar_3 {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(countingDuplicateCharacters(str));
	}

	public static Map<Character, Integer> countingDuplicateCharacters(String str) {
		Map<Character, Integer> result = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if (result.containsKey(ch)) {
				result.put(ch, result.get(ch) + 1);
			}
			else {
				result.put(ch, 1);
			}
		}
		
		return result;

	}
}
