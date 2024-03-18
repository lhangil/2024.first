package day0318;

public class Stringmain6 {

	public static void main(String[] args) {
		
		String s= "Hel";
		String s2= "hdd";			
		
		s= new String("Hello");
		s2= new String("Hello");
		
		boolean bool= s.equals(s2);
		if(bool) {
			System.out.println("equals() : 같다");
			
		} else {
			System.out.print("equals(): 다르다");
		}
		 
		// TODO Auto-generated method stub

	}

}
