package day0312;

public class Arrangement08 {

	public static void main(String[] args) {
		String str= "2024년";
		//원래 String str= new String("2024년"); 이라고해야함
		String str2= "java";
		String str3= "교육";
		//어쨌든 얘네 셋을 모아놓은 변수를 만들고싶음
		String[] strArr= {str,str2,str3};
		// --->String[] strArr= {"2024","java","교육"} 이랑 같음
		
	for(String s : strArr) {
		System.out.println(s);
		
		/*System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(int data : arr) {
			System.out.print(data + "  "); ????????????
			data????? s?????*/

	}

	}

}
