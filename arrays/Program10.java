package assignment2.arrays;

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.println("Enter the number of rows in the matrices:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns in the matrices:");
        c = sc.nextInt();
        
      
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] mul = new int[r][c];
        
        
        System.out.println("Enter the values for matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter the values for matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mul[i][j] = A[i][j] * B[i][j];
            }
        }

      
        System.out.println("Matrix multiplication result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                if (mul[i][j] < 10) {
                    System.out.print("0" + mul[i][j] + " ");
                } else {
                    System.out.print(mul[i][j] + " ");
                }
            }
            System.out.println(); 
        }

        sc.close(); 
    }
}
