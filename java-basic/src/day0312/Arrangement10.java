package day0312;

public class Arrangement10 {

	public static void main(String[] args) {
		String[] strArr = {"봄", "여름"};
		String[] strArr2 = {"가을", "겨울"};
		String[] strArr3 = new String[strArr.length + strArr2.length];


		
		
		System.arraycopy(strArr,0,strArr3,strArr.length);
		System.arraycopy(strArr2, 0,strArr3 ,strArr.length, strArr2.length, );
		
		// TODO Auto-generated method stub

	}

}
