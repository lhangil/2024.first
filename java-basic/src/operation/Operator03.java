package operation;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("ù���� ����:");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι��� ����: ");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		boolean result = firstNum % secondNum == 0;
		System.out.printf("%d�� %d�� ������� �Ǵ� :%b\n", firstNum, secondNum, result);
				
	}

}
