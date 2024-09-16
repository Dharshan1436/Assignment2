package assignment2.advanceArray;

public class Program3 {
	public static int[] findIntersection(int ar1[], int ar2[]) {
		int temp[] = new int[Math.min(ar1.length, ar2.length)];
		int index = 0;
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					
				boolean isDuplicate = false;
				
				for (int k = 0; k < index; k++) {
					if (temp[k] == ar1[i]) {
						isDuplicate = true;
					}

				}
				if (!isDuplicate) {
					temp[index++] = ar1[i];
				}
				}
			}

		}
		int result[] = new int[index];
		for (int l = 0; l < index; l++) {
			result[l] = temp[l];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 4,1,8 };

		int[] result = findIntersection(arr1, arr2);

		System.out.print("Intersection of arrays: ");
		for (int value : result) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
