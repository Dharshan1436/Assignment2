package assignment2.strings;

import java.util.Scanner;

public class Program14 {

	
		void solve(String str){
	        int arr[] = new int[26];

	        for(int i = 0; i<str.length(); i++){
	            arr[str.charAt(i)-'a']++;
	        }

	        int count = 0;
	        for(int i = 0; i<arr.length; i++){
	            if(arr[i] != 0){
	                count++;
	            }
	        }

	        System.out.println(count);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Program14 p = new Program14();

	        System.out.println("Enter a first string: ");
	        String str = sc.nextLine();

	        p.solve(str);
	

	}

}
