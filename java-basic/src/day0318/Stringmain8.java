package day0318;

public class Stringmain8 {

	public static void main(String[] args) {
		String str= "hello world";
		char search= 'o';
		
		int idx= str.indexOf(search);
		System.out.println(search+"������ ��ġ:"+idx);
		
		idx= str.lastIndexOf(search);
		System.out.println("lastindexof()" + search + "��������ġ:"+ idx);
	
		
		search='p';
		idx= str.indexOf(search);
		System.out.println("indexof() : " + search+ "������ ��ġ: " +idx);
		
		search= '1';
		System.out.println("<[ "+ str+ "]����"+  search +" ������ġ>");
		idx= str.indexOf(search);
		while(idx != -1) {
			System.out.println("ã����ġ: " +idx);
			idx=str.indexOf(search, idx+1);
		}
		
	}

}
