package NewPackege;

public class StringPractice1 {

	public static void main(String[] args) {

		String s = "Madhur#@!&";

		int count = countSpecialChar(s);

		System.out.println("Count for Special character is:" + count);

	}

	private static int countSpecialChar(String s) {
		int c = 0;
		String temp = "";
		String temp1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				temp1 += s.charAt(i);
				c++;
			} else {
				temp += s.charAt(i);
			}
		}
		System.out.println(temp1);
		System.out.println(temp);
		return c;
	}

}
