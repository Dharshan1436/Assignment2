package assignment2.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {
	public static boolean isAnagram(String s1, String s2) {
		String str1 = s1.replace("\\s", "");
		String str2 = s2.replace("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(c2);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String s1");
		String s1 = sc.nextLine();
		System.out.println("Enter String s1");
		String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2));;
	}

}
