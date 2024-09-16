package assignment2.arrays;

import java.util.Scanner;

public class Program2 {
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
	public static int sum(int ar[]) {
		int sum = 0;
		for (int element : ar) {
			sum = sum + element;
		}
		return sum;
	}

	public static double average(int sum, int size) {
		return sum / size;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = createArray(sc);
		display(ar);
		int sum = sum(ar);
		System.out.println("Sum of elements = " + sum);
		double average = average(sum, ar.length);
		System.out.println("Average of elements = "+average);
	}

}
