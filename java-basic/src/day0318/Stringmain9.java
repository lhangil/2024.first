package day0318;

public class Stringmain9 {

	public static void main(String[] args) {
		
		long start= System.currentTimeMillis();
		String str= "";
		for(int i =1; i < 100000; i ++) {
			System.out.println(str += i);}
		
		long end= System.currentTimeMillis();
		System.out.println("소요시간:" + (end-start)/1000.+"초");

	}

}
