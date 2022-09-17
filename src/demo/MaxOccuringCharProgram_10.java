package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringCharProgram_10 {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		maxOccuringOfChar(str);
	}

	private static void maxOccuringOfChar(String str) {
		Map<Character, Integer> result = new HashMap<>();

		char[] chArray = str.replaceAll("\\s", "").toCharArray();

		for (char ch : chArray) {
			if (result.containsKey(ch)) {
				result.put(ch, result.get(ch) + 1);
			} else {
				result.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>> entrSet = result.entrySet();

		int maxCount = 0;
		char maxChar = 0;

		for (Entry<Character, Integer> entry : entrSet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		
		System.out.println(" Max char : " + maxChar + " ======= " + "Max Count :"+ maxCount); 
	}

}
