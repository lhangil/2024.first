package homework;

import java.util.Scanner;

public class Homework09 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수:");
		int a=sc.nextInt();
		if(a<0) {
			System.out.print("잘못 입력했습니다");}
		
		 if(a==0) {
		System.out.print("보유하고 있는 책 없음");}
		
		 if(a==1) {
			System.out.print(a+"book");}
		
		else { System.out.print(a+"books");
		
	
		
	
		}
		
	 
		
	   
				
			
		
	}
	

}
