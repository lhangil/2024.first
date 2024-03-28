package day0327baekjun;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a = sc. nextInt();
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=10-(2*i-1); k++) {
				System.out.print("*");
			}
		
			System.out.println();
	}

}
}


// j=1 j>=3 // j=2 j>4-2 // j=3 j>4-3 // 