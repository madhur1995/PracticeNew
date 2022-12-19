package NewPackege;

public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello My name is Madhur Patel";
		int mid = s.length() / 2;
		String lower = "";
		String upper = "";

		for (int i = 0; i < s.length(); i++) {
			if (i < mid) {
				lower += Character.toLowerCase(s.charAt(i));
			} else {
				upper += Character.toUpperCase(s.charAt(i));

			}
		}

		System.out.println(lower + upper);

	}

}
