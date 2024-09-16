package assignment2.strings;

import java.util.Scanner;

public class Program13 {

	public static String getString(Scanner sc) {
		System.out.println("Enter the string:");
		return sc.nextLine();
	}

	public static void countCharacterFrequency(String str) {

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (currentChar == ' ' || str.indexOf(currentChar) < i) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == currentChar) {
					count++;
				}
			}

			System.out.println(currentChar + ": " + count);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = getString(sc);
		countCharacterFrequency(str);
		sc.close();
	}

}
