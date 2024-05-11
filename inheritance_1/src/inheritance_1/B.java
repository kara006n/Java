package inheritance_1;
//inheritance provide code reusablity as we now dont have to write
//test method again
public class B extends A{
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		b.test();
	}

}
