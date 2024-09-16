package assignment2.advanceArray;

public class Program1 {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		for(int k:ar) {
			System.out.print(k+" ");
		}
		System.out.println();
		int n = 2;
		for (int i = 0; i < n; i++) {
			int first = ar[0], j;
			for (j = 0; j < ar.length - 1; j++) {
				ar[j] = ar[j + 1];
			}
			ar[j] = first;
		}
		for(int k:ar) {
			System.out.print(k+" ");
		}
	}

}
