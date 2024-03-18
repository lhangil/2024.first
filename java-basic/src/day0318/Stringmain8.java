package day0318;

public class Stringmain8 {

	public static void main(String[] args) {
		String str= "hello world";
		char search= 'o';
		
		int idx= str.indexOf(search);
		System.out.println(search+"문자의 위치:"+idx);
		
		idx= str.lastIndexOf(search);
		System.out.println("lastindexof()" + search + "문자의위치:"+ idx);
	
		
		search='p';
		idx= str.indexOf(search);
		System.out.println("indexof() : " + search+ "문자의 위치: " +idx);
		
		search= '1';
		System.out.println("<[ "+ str+ "]에서"+  search +" 문자위치>");
		idx= str.indexOf(search);
		while(idx != -1) {
			System.out.println("찾은위치: " +idx);
			idx=str.indexOf(search, idx+1);
		}
		
	}

}
