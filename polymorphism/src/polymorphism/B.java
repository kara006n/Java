package polymorphism;

public class B extends C{

	@Override
	public void test() {
		System.out.println(200);
	}
	

}
//if we have private method in C and make them public in B will it
//work..no because private not inherited.