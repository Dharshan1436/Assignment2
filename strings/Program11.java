package assignment2.strings;

import java.util.Scanner;

public class Program11 {
	public static String reversse(String s) {
		String rs = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rs = ch + rs;
		}
		return rs;
	}

	public static boolean polindrom(String s) {
		String r = reversse(s);
		if (s.equalsIgnoreCase(r)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String data :");
		String s = sc.nextLine();
		System.out.println(polindrom(s));
		;

	}

}
