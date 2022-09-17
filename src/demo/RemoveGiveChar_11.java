package demo;

public class RemoveGiveChar_11 {

	public static void main(String[] args) {
		String str = "Ganapathi";
		char ch = 'a';
		System.out.println(removeGivenCharacter(str, ch));

	}

	private static String removeGivenCharacter(String str, char ch) {
		String newStr = "";
		char[] chArray = str.toCharArray();

		for (char chr : chArray) {
			if (chr != ch) {
				newStr += chr;
			}
		}
		return newStr;
	}

}
