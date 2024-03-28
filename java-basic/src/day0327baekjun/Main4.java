package day0327baekjun;

public class Main4 {
	public static void main(String[] args) {
		
			int a = 0;
			
			for(int i = 1; i<10; i++) {
				if(i<6) {
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				
			for(int kj= 1; kj<=2*i-1; kj++) {
				System.out.print("*");
			} System.out.println();
		}
				else { 
					for(int ab=1; ab<i-4; ab++  ) {
						System.out.print(" ");
					}
					for(int j=1; j<=19-(i*2); j++ ) {
						System.out.print("*");
				} System.out.println();
					

		}

	}

	}
}
