package NewPackege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		// Adding elements in the List
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		for (String fruit : list)
			System.out.println(fruit);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aman");
		map.put(2, "bansal");
		map.put(3, "chahal");
		map.put(4, "dev");
		map.put(5, "kp");
		map.put(6, "madhur");
		map.put(7, "yogi");

		System.out.println(map);

		int arr[] = { 1, 2, 5, 4, 7, 8, 9, 20, 3 };

		int a[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

}
