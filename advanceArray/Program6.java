package assignment2.advanceArray;

public class Program6 {
    public static void moveZeroes(int[] arr) {
        
        int nonZeroIndex = 0;

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
               
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
