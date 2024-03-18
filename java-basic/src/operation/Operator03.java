package operation;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번재 정수:");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번재 정수: ");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		boolean result = firstNum % secondNum == 0;
		System.out.printf("%d는 %d의 배수여부 판단 :%b\n", firstNum, secondNum, result);
				
	}

}
