
public class C implements A{//class will give error when implementing interface press ctrl+1 and override automatically

	@Override
	public void test() {
		System.out.println(100);
		
	}
	 
	@Override
	public void test1() {
		System.out.println(200);
	}
	
	public static void main(String[] args) {
		
		 C c = new C();
		 c.test();
		 c.test1();
	}

}
