package day0311;

import java.util.Scanner;

public class Arrangement02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "\'s num : ");
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");


		
	}
		
	
}
}
