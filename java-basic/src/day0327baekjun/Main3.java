package day0327baekjun;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <=a; i++) {
			if (i < a%2) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}

				for (int kj = 1; kj <= 2 * i - 1; kj++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int ab = 1; ab < i - 4; ab++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 19 - (i * 2); j++) {
					System.out.print("*");
				}
				System.out.println();

			}

		}
	}
}
