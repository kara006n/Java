package interface_2;

public class C implements B{

	@Override
	public void test1() {
		System.out.println("method from A");
	}

	@Override
	public void test() {
		System.out.println("method from B");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.test();
		c.test1();
	}

}
