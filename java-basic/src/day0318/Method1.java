package day0318;

public class Method1 {

	public static void main(String[] args) {
		Student student1 =new Student();
		
		student1.name= "�л�1";
		student1.age= 15;
		student1.grade=90;
		
		
		Student student2= new Student();
		student2.name= "�л�2";
		student2.age= 16;
		student2.grade= 80;
		
		printStudent(student1);
		printStudent(student2);
	}
		static void printStudent(Student student) {
			System.out.println("�̸�:"+student.name+ "����:" + student.age + "����:"+ student.grade);
		}
		
	

		
		
		

	}


