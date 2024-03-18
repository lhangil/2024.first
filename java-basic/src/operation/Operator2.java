package operation;

public class Operator2 {
public static void main(String[] args) {
	int firstNum =12;
	int secondNum =-4;
	
	boolean result = firstNum % secondNum ==0;
	System.out.println(result);
	System.out.println(result ? "배수야" : "배수아니야");
	System.out.println(!result ? "배수아니야" : "배수야"); //


}
}
