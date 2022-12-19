package MyPackage;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {

		if (u1.getAge() == u2.getAge())
			return 0;
		else if (u1.getAge() > u2.getAge())
			return 1;
		else
			return -1;

	}

}
