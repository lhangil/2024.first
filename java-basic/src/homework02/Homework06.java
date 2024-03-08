package homework02;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.print("1's 성적:");
		int a= sc.nextInt();
		if(a>=90) { System.out.printf("%d점의 학점은 %c입니다",a,'A');
		} 
		else if(a>=80) {System.out.printf("%d점의 학점은 %c입니다",a,'B');
	
		
		}
		else if(a>=70) {System.out.printf("%d점의 학점은 %c입니다",a,'C');
		}
		else if(a>=60) {System.out.printf("%d점의 학점은 %c입니다",a,'D');
	}
		else {System.out.printf("%d점의 학점은 %c입니다",a,'F');}
		
		
		}
		
}
