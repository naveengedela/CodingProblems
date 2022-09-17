package demo;

public class countOccranceOfCharacter_4 {

	public static void main(String[] args) {
		String str = "reddy";
		char ch = 'd';

		System.out.println(countOccranceOfCharacters(str, ch));
	}

	private static int countOccranceOfCharacters(String str, char ch) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
