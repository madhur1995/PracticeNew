package MyPackage;

import java.util.Comparator;

public class ComparatorWithTwoParam implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		int result = o1.getName().compareToIgnoreCase(o2.getName());
		if (result == 0) {
			return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
		} else {
			return result;
		}

	}
}