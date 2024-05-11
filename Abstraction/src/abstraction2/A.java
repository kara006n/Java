package abstraction2;
//here c is interface then that is implemented in abstarct class B then later on extended by normal class A
public class A extends B {

	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		A  a = new A();
		a.test();
		a.test2();
	}

}
