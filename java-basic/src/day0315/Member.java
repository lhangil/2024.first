package day0315;

public class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		name= "�˼�����";
		age= -1;
		bloodType = "�˼�����";
	}
	
	Member(String n,int a) {
		name = n;
		age= a;
		bloodType= "�˼�����";
	}
	
	void info() {
		System.out.println("�̸�:" + name + ",���� : " +age + ",������:" +bloodType);
		
	}
	
	
}
