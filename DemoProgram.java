package NewPackege;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoProgram {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 5, 2, 3, 5, 7, 9);

		System.out.println(list);

		list.stream().sorted().forEach(i -> {
			System.out.print(i + " ");
		});

		long max = list.stream().mapToInt(i -> i).summaryStatistics().getMax();
		System.out.println();
		System.out.println(max);

		List<String> stringList = Arrays.asList("ahah", "yfgf", "ugfgfg", "laha");

		stringList.stream().filter(i -> i.equals("ahah")).forEach(i -> System.out.println(i));

		List<String> s = stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(s);

		System.out.println(stringList.stream().findFirst());
	}
}
