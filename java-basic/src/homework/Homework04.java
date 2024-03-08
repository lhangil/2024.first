package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수:");
		int a= sc.nextInt();
		sc.nextLine(); //
		System.out.println("a:"+ a);
		
		System.out.print("나눌 수:");
		int b= sc.nextInt();
		sc.nextLine();
		System.out.println("b:" + b);
		
	
		int c = a/b ;
		
		System.out.println("몫:"+c);
		
		int d = a%b ;
		System.out.println("나머지:" + d);


	}

}
