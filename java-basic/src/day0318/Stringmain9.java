package day0318;

public class Stringmain9 {

	public static void main(String[] args) {
		
		long start= System.currentTimeMillis();
		String str= "";
		for(int i =1; i < 100000; i ++) {
			System.out.println(str += i);}
		
		long end= System.currentTimeMillis();
		System.out.println("�ҿ�ð�:" + (end-start)/1000.+"��");

	}

}
