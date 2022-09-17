package demo;

public class CheckingDigitsInString_1 {

	public static void main(String[] args) {
		String str = "Java69";
		System.out.println(containOnlyDigits(str));
	}

	private static boolean containOnlyDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
