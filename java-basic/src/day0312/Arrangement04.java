package day0312;

public class Arrangement04 {

	public static void main(String[] args) {
	
		int[] arr = new int [5];
		
		/*arr[0] = 10;
		arr[1]= 20;
		arr[2]= 30;*/
		
		System.out.println("< index를 이요한 출력>")
		for(int i = 0; i < arr.length; i++) {
			arr[i]= (i+1)*10;
		}
		
		/*배열의 모든 원소를 출력방식
		 * 1. index를 이용한 출력
		 * 2.1.5버전의 for문을 이용한 출력
		 * Array.toString() 메소드를 이요한 출력
		 * */
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.print(); //print 뒤에는 ()만 올수 없다.(" ") 와야함

	}

}
