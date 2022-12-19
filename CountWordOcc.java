package NewPackege;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is khan my name My is";
		String s1 = s.toLowerCase();
		List<String> list = Arrays.asList(s1.split(" "));

		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);

		count.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		Set<String> duplicate = count.entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey())
				.collect(Collectors.toSet());

		System.out.println(duplicate);

		Set<String> nonDuplicate = count.entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey())
				.collect(Collectors.toSet());

		System.out.println(nonDuplicate);

		List<Integer> intList = Arrays.asList(55, 2, 66, 22, 55, 1, 55, 87, 5);

		intList.stream().forEach(System.out::print);

		System.out.println();
		intList.parallelStream().forEach(System.out::print);

	}

}
