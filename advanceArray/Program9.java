package assignment2.advanceArray;

public class Program9 {

	public static void findSubarrayWithSum(int[] arr, int targetSum) {
		int currentSum = 0;
		int start = 0;

		for (int end = 0; end < arr.length; end++) {

			currentSum += arr[end];

			while (currentSum > targetSum && start <= end) {
				currentSum -= arr[start];
				start++;
			}

			if (currentSum == targetSum) {
				System.out.println("Subarray found from index " + start + " to " + end);
				return;
			}
		}

		System.out.println("No subarray with the given sum found.");
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int targetSum = 5;

		findSubarrayWithSum(arr, targetSum);
	}
}
