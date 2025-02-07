package assignment2.advanceArray;

import java.util.Arrays;

public class Program10 {

	public static int findLongestConsecutiveSequence(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);

		int longestStreak = 1;
		int currentStreak = 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == nums[i - 1]) {
				continue;
			}

			if (nums[i] == nums[i - 1] + 1) {
				currentStreak++;
			} else {

				longestStreak = Math.max(longestStreak, currentStreak);
				currentStreak = 1;
			}
		}

		longestStreak = Math.max(longestStreak, currentStreak);

		return longestStreak;
	}

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };

		int longestSequence = findLongestConsecutiveSequence(nums);

		System.out.println("The longest consecutive sequence length is: " + longestSequence);
	}
}
