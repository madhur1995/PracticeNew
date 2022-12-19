package NewPackege;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		str = str.replaceAll(" ", "");
		char y[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : y) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {

			if (data.getValue() > 0) {
				System.out.print(data.getKey());
				System.out.println(" " + data.getValue());
			}
		}

	}
}
