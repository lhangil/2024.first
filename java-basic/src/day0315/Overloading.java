package day0315;

public class Overloading {
	 public static void main(String[] args) {
		 System.out.println("1: " + add(1, 2));
		 System.out.println("2: " + add(1, 2, 3));
		    }
		 // ù ��° add �޼���: �� ������ �޾Ƽ� ���� ��ȯ�Ѵ�.
		 public static int add(int a, int b) {
		 System.out.println("1�� ȣ��");
		 return a + b;
		    }
		 
	
		// �� ��° add �޼���: �� ������ �޾Ƽ� ���� ��ȯ�Ѵ�.
		 // ù ��° �޼���� �̸��� ������, �Ű����� ����� �ٸ���.
		 public static int add(int a, int b, int c) {
		 System.out.println("2�� ȣ��");
		 return a + b + c;

}

}

