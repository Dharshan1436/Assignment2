package assignment2.advanceArray;

public class Program7 {

	public static void segregateZeroesAndOnes(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == 0 && left < right) {
				left++;
			}

			while (arr[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {

				arr[left] = 0;
				arr[right] = 1;

				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0 };

		segregateZeroesAndOnes(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}