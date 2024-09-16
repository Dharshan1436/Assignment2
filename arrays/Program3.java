package assignment2.arrays;

import java.util.Scanner;

public class Program3 {
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
	public static int max(int []ar) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
	public static int min(int []ar) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = createArray(sc);
		display(ar);
		int max=max(ar);
		System.out.println("maximum value in on array = "+max);
		int min=min(ar);
		System.out.println("minimum value in on array = "+min);
	}

}
