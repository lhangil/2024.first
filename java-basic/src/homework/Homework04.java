package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("����:");
		int a= sc.nextInt();
		sc.nextLine(); //
		System.out.println("a:"+ a);
		
		System.out.print("���� ��:");
		int b= sc.nextInt();
		sc.nextLine();
		System.out.println("b:" + b);
		
	
		int c = a/b ;
		
		System.out.println("��:"+c);
		
		int d = a%b ;
		System.out.println("������:" + d);


	}

}
