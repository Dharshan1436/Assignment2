package assignment2.arrays;

import java.util.Scanner;

public class Program8 {
	public static int[] createArray(Scanner sc) {
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter the Array values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	public static void display(int[] ar) {
		System.out.print("array elements : ");
		for (int j : ar) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	public static void printDuplicate(int[] ar) {
	    
	    for (int i = 0; i < ar.length - 1; i++) {
	        for (int j = i + 1; j < ar.length; j++) {  
	            if (ar[i] == ar[j]) {
	                System.out.println(ar[j]);
	                break; 
	            }
	        }
	    }
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = createArray(sc);
		display(ar);
		printDuplicate(ar);

	}

}
