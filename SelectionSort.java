package NewPackege;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method

		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int loc = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					loc = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;

		}

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

	}

}
