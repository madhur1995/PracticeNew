package NewPackege;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCD";
		String s2 = "CDABF";
		boolean b = isRotation(s1, s2);
		if (b)
			System.out.println("Rotaton");
		else
			System.out.println("Not Rotation");

	}

	private static boolean isRotation(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		else if (s1.concat(s1).contains(s2))
			return true;
		else
			return false;

	}

}
