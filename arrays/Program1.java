package assignment2.arrays;

import java.util.Scanner;

public class Program1 {
	public static int [] createArray(Scanner sc) {
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter the Array values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	public static void display(int [] ar) {
		System.out.print("array elements : ");
		for(int j:ar) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar=createArray(sc);
		display(ar);
	}

}
