package assignment2.advanceArray;

public class Program4 {

	public static int findSecondLargest(int[] arr) {

		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 36,34, 1 };

	
			int secondLargest = findSecondLargest(arr);
			System.out.println("The second largest element is: " + secondLargest);
		
	}
}
