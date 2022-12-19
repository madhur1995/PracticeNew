package NewPackege;

public class StringsNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Cock";
		char c = 'C';

		remove(s, c);

	}

	public static void remove(String s, char c) {
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				s1 += s.charAt(i);
			}
		}

		System.out.println(s1);
	}

}
