package operation;

public class Operator {
	public static void main(String[] args) {
		int u = 5;
		 System.out.println(u++);  
		System.out.println(++u);
		 System.out.println(--u);
		 System.out.println(u  );
		 System.out.println(u--);
		 System.out.println(u++); // Sysout+ctrl+space = System.out.println 자동완성

		 int num01= 100;
		 System.out.println(); // ctrl+alt+아래방향키 =복사
		 System.out.println();  // ctrl+/ = 그 줄 주석.
		 
		 int a= 0, b= 1, c= -1;
		 
		 boolean result = ++a > 0 && ++b >= 1 && ++c > 0;
		 
		 System.out.println(result);
		 System.out.println("a : " + a + " , b: "+ b + " , c: " + c);
	}

}
