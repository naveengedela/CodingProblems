package feb_1;

public class ReverseString {

	public static void main(String[] args) {
		char[] chars = {'h','e','l','l','o'};
		reverseStr(chars);
		
	}

	private static void reverseStr(char[] ch) {
		int i = 0;
		int j = ch.length -1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(ch);
	}

}
