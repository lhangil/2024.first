package day0315;

import java.util.Scanner;

public class GugudanUtil {
	
		void print(int dan) {
			System.out.println("***"+ dan + "�� ***");
			for(int i =1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n", dan,i,dan*i);
			}
		}
	
		
		int inputDan() {
			Scanner sc= new Scanner(System.in);
			System.out.print("���� �Է�:");
			int dan= sc.nextInt();
			sc.nextLine();
			
			return dan;
		}
		
	}
	


