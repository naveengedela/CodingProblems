package strings;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
//		System.out.println(isAnagramShown(s, t));
		System.out.println(isItAnagramShown(s, t));
	}

	public static boolean isAnagramShown(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] counts = new int[26];

		for (int i = 0; i < s.length(); i++) {
//			System.out.println(counts[s.charAt(i)]);
			System.out.println(counts[s.charAt(i) - 'a']);
			counts[s.charAt(i) - 'a']++;
			counts[t.charAt(i) - 'a']--;
		}
		for (int i : counts) {
			if (i != 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isItAnagramShown(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
		}
		for (char ch : map.keySet()) {
			if (map.get(ch) != 0) {
				return false;
			}
		}
		return false;
	}
}
