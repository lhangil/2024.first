package homework;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���ǰ�:");
		int price=sc.nextInt();
		sc.nextLine();
		int pay=10000;
		int rest= pay-price;
		System.out.println("�Ž�����:"+rest+"��");
		
		int a=rest/1000;
		int b=(rest-(1000*a))/500;
		int c=(rest-(1000*a+500*b))/100;
		int d=(rest-(1000*a+500*b+100*c))/50;
		int e=(rest-(1000*a+500*b+100*c+50*d))/10;
		
		System.out.println("1000��:"+a);
		System.out.println("500��:"+b);
		System.out.println("100��:"+c);
		System.out.println("50��:"+d);
		System.out.println("10��:"+e);
		
		
		
	}
}
