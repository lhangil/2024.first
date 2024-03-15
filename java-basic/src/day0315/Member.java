package day0315;

public class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		name= "알수없음";
		age= -1;
		bloodType = "알수없음";
	}
	
	Member(String n,int a) {
		name = n;
		age= a;
		bloodType= "알수없음";
	}
	
	void info() {
		System.out.println("이름:" + name + ",나이 : " +age + ",혈액형:" +bloodType);
		
	}
	
	
}
