package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double exchangerate = 1092.50;
		
		System.out.println("환율:"+ exchangerate);
		System.out.print("달러:");
		double a= sc.nextDouble();
		sc.nextLine();
		System.out.println("달러가"+a+"일때");
		
		double b= exchangerate*a;
		System.out.println("원화:"+b);
	
		
		
		
		
	}
}