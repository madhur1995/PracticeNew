package MyPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// Adding elements in the List
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// list.remove(3);
		// Iterating the List element using for-each loop

		Collections.sort(list);

		for (String fruit : list)
			System.out.println(fruit);

		String[] array = { "Java", "Python", "PHP", "C++", "aaa" };

		List<String> list1 = new ArrayList<String>();

		for (String abc : array) {
			list1.add(abc);
		}
		System.out.println("Printing List: " + list1);

		Collections.sort(list1);

		System.out.println("After Sorting: " + list1);

		List l = new ArrayList<>();

		l.add(new User(1, "aman", 55, 20000));
		l.add(new User(2, "kp", 10, 23000));
		l.add(new User(3, "jp", 22, 27000));
		l.add(new User(4, "sp", 67, 31000));
		l.add(new User(5, "yogi", 18, 36000));
		l.add(new User(6, "amit", 28, 42000));
		l.add(new User(7, "chaman", 28, 42000));
		l.add(new User(8, "pawan", 28, 42000));
		l.add(new User(9, "maddy", 28, 42000));

		// Collections.sort(l, new AgeComparator());

		// System.out.println(l);

		// Collections.sort(l, new NameComparator());

		// System.out.println(l);

		List a = new ArrayList<>();

		a.add(new Student(1, "aman", 55, 20000));
		a.add(new Student(2, "kp", 10, 23000));
		a.add(new Student(3, "jp", 22, 27000));
		a.add(new Student(4, "sp", 67, 31000));
		a.add(new Student(5, "yogi", 18, 36000));
		a.add(new Student(6, "amit", 28, 42000));

		// Collections.sort(a);

		// Collections.sort(l, new ComparatorWithTwoParam());

		l.sort(Comparator.comparing(User::getAge).thenComparing(User::getName));

		System.out.println(l);

	}

}
