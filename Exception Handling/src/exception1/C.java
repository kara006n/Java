package exception1;

public class C {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		try {
			//System.out.println(10/0);
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
