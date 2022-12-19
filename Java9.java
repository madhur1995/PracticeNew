package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9 {

	@SafeVarargs
	private void display(List<String>... products) { // Not using @SaveVarargs
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		Java9 p = new Java9();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		list.add("Tablet");
		p.display(list);

		List<Integer> l = new ArrayList();
		l.add(44);
		l.add(56);
		l.add(78);
		l.add(35);
		l.add(37);

		List<Integer> myList = l.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(myList);

		List<Integer> myList1 = l.stream().dropWhile(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(myList1);

		Stream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println); // Stop Condition is introduced in JAVA
																					// 9

		System.out.println("****************");

		Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x)); // Java 8 we have to use LIMIT for
																						// STOP Condition

		System.out.println("***************");
		int count = (int) Stream.ofNullable(5000).count();
		System.out.println(count);
		
		System.out.println("****************");
		count = (int) Stream.ofNullable(null).count();
		System.out.println(count);

	}

}
