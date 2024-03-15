package day0315;

public class Constructor02 {
	public static void main(String[] args) {
		Member m = new Member();
		Member m2= new Member("홍길동");
		Member m3= new Member("고길동",30);
		
		
		m.info();
		m2.info();
		m3.info();
		
		
	}

}
