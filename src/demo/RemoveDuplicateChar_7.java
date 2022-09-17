package demo;

public class RemoveDuplicateChar_7 {

	public static void main(String[] args) {
		String str = "vinayaka";
		System.out.println(removeDuplicateChar(str));
	}

	private static String removeDuplicateChar(String str) {
		char[] chArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char ch: chArray) {
			if (sb.indexOf(String.valueOf(ch)) ==-1) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}

}
