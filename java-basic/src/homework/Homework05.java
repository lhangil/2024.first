package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double exchangerate = 1092.50;
		
		System.out.println("ȯ��:"+ exchangerate);
		System.out.print("�޷�:");
		double a= sc.nextDouble();
		sc.nextLine();
		System.out.println("�޷���"+a+"�϶�");
		
		double b= exchangerate*a;
		System.out.println("��ȭ:"+b);
	
		
		
		
		
	}
}