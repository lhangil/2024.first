package homework02;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.print("1's ����:");
		int a= sc.nextInt();
		if(a>=90) { System.out.printf("%d���� ������ %c�Դϴ�",a,'A');
		} 
		else if(a>=80) {System.out.printf("%d���� ������ %c�Դϴ�",a,'B');
	
		
		}
		else if(a>=70) {System.out.printf("%d���� ������ %c�Դϴ�",a,'C');
		}
		else if(a>=60) {System.out.printf("%d���� ������ %c�Դϴ�",a,'D');
	}
		else {System.out.printf("%d���� ������ %c�Դϴ�",a,'F');}
		
		
		}
		
}
