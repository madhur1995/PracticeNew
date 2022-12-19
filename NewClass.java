package NewPackege;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewClass {

	public static void main(String[] args) {

		String str = "my name is madhur my";

		List<String> list = Arrays.asList(str.split(" "));

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet().forEach(i -> {
			System.out.println(i.getKey() + " " + i.getValue());

		});

		List<Integer> list1 = Arrays.asList(9, 3, 5, 1, 5, 2, 47, 8, 22);

		double min = list1.stream().mapToInt(i -> i).summaryStatistics().getCount();

		System.out.println(min);

	}

}
