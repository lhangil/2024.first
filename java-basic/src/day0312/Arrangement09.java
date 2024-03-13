package day0312;

import java.util.Arrays;

public class Arrangement09 {

	public static void main(String[] args) {
		String[] strArr = {"봄", "여름"};
		String[] strArr2 = {"가을","겨울"};
		
		String[] strArr3= new String[strArr.length + strArr2.length];
		
		
		/*strArr3[0] = strArr[0];
		strArr3[1]= strArr[1];
		strArr3[2] = strArr2[0];
		strArr3[3] = strArr2[1];*/
		int loc = 0;
		for(int i = 0; i < strArr.length; i++) {
			strArr3[loc++] = strArr[i];
		}
		
		for(String season : strArr2) {
			strArr3[loc++] = season;
		}
		System.out.println(Arrays.toString(strArr3));
		
		
	
		

	}

}
