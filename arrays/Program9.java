package assignment2.arrays;

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        
       
        System.out.println("Enter the row array size:");
        r = sc.nextInt();
        System.out.println("Enter the column array size:");
        c = sc.nextInt();

       
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum = new int[r][c];
        
       
        System.out.println("Enter the A Array values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter the B Array values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        
        System.out.println("Array Sum of A and B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(sum[i][j]<10 ) {
                	System.out.print("0"+sum[i][j] + " ");
                }else {
                	System.out.print(sum[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
