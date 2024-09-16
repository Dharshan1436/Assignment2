package assignment2.advanceArray;

public class Program8 {

	void mergeIntervals(int arr[][]) {
		int[] curr = new int[2];
		curr = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (curr[1] < arr[i][0]) {
				System.out.println(curr[0] + " " + curr[1]);
				curr = arr[i];
			} else {
				curr[1] = Math.max(arr[i][1], curr[1]);
			}
		}

		System.out.println(curr[0] + " " + curr[1]);
	}

	public static void main(String[] args) {
		Program8 p = new Program8();

		int arr[][] = { { 1, 2 }, { 2, 3 }, { 4, 9 }, { 5, 7 }, { 6, 8 }, { 10, 15 } };

		p.mergeIntervals(arr);
	}
}