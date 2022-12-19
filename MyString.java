package NewPackege;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Hello";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0)
				s1 += "#";
			else
				s1 += s.charAt(i);

		}

		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				s2 += s.charAt(i);

			}

		}

		System.out.println(s1);
		System.out.println(s2);

	}

}
