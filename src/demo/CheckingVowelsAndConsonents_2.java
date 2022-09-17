package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckingVowelsAndConsonents_2 {
	private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));


	public static void main(String[] args) {
		String str = "java";
		checkVowelsAndConsonants(str);
	}

	private static void checkVowelsAndConsonants(String str) {
		str = str.toLowerCase();

		int vCount = 0, cCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (allVowels.contains(str.charAt(i))) {
				vCount++;
			}
			else if (str.charAt(i) >='a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
