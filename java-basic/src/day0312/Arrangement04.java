package day0312;

public class Arrangement04 {

	public static void main(String[] args) {
	
		int[] arr = new int [5];
		
		/*arr[0] = 10;
		arr[1]= 20;
		arr[2]= 30;*/
		
		System.out.println("< index�� �̿��� ���>")
		for(int i = 0; i < arr.length; i++) {
			arr[i]= (i+1)*10;
		}
		
		/*�迭�� ��� ���Ҹ� ��¹��
		 * 1. index�� �̿��� ���
		 * 2.1.5������ for���� �̿��� ���
		 * Array.toString() �޼ҵ带 �̿��� ���
		 * */
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.print(); //print �ڿ��� ()�� �ü� ����.(" ") �;���

	}

}
