package demo;

public class RemoveWhitspace_8 {

	public static void main(String[] args) {
		String str = "   reddyt";
		System.out.println(removeWhitspaceOfString(str));
	}

	private static String removeWhitspaceOfString(String str) {
		return str.replaceAll("\\s", "");
	}

}
