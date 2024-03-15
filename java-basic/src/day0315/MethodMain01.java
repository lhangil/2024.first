package day0315;

public class MethodMain01 {

	public static void main(String[] args) {
		Method01 m = new Method01();
		m.call();
		m.call(10);
		m.call("Hello");
		m.call(24.15);
		m.call('A'); /*얘는 chr가 없어도 
		int로도되니까 오류가 안뜸*/
	}

}
