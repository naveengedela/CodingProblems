package demo;

public class WordReversal_9 {

	public static void main(String[] args) {
		String str = "java problems";
		System.out.println(reverseWords(str));
	}

	private static final String WHITESPACE = " ";

//	private static String reverseWords(String str) {
//		String[] words = str.split(" ");
//
//		String reverseString = "";
//
//		for (int i = words.length - 1; i >= 0; i--) {
//
//			reverseString += words[i] + " ";
//
//		}
//		return reverseString;
//	}

	private static String reverseWords(String str) {
		String[] words = str.split(" ");

		StringBuilder reversedWords = new StringBuilder();

		for (String word : words) {

			StringBuilder reversedWord = new StringBuilder();

			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord.append(word.charAt(i));
			}
			reversedWords.append(reversedWord).append(" ");
		}
		return reversedWords.toString();
	}
}
