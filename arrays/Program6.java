package assignment2.arrays;

import java.util.Scanner;

public class Program6 {
	static int positive;
	static int negative;
	static int [] positiveArray;
	static int [] negativeArray;

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

	public static void positiveNegativeCount(int[] ar) {
		positive=0;
		negative=0;
		for (int i : ar) {
			if (i >= 0) {
				positive++;
			} else {
				negative++;
			}
		}

	}
	
public static void positiveNegativeArray(int ar[]) {
	positiveNegativeCount(ar);
	positiveArray=new int[positive];
	negativeArray=new int[negative];
	int i=0;
	int j=0;
	
	for(int e:ar) {
		if(e>=0) {
			positiveArray[i++]=e;
		}else {
			negativeArray[j++]=e;
		}
	}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = createArray(sc);
		display(ar);
		positiveNegativeArray(ar);
		display(positiveArray);
		display(negativeArray);
		

	}

}
