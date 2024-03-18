package day0318;

public class Stringmain7 {
	public static void main(String[] args) {
		String word = "hello World";
		String word2 = "her";
		
		int cmp = word.compareTo(word2);
		if(cmp == 0) {
			System.out.printf("%s == %s\n", word, word2);
		} else if(cmp > 0) {
			System.out.printf("%s > %s\n", word, word2);
		} else {
			System.out.printf("%s < %s\n", word, word2);
		}

	}

}
