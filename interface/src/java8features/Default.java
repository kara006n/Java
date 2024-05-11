package java8features;
//because of default keyword now we can use complete methods in java class, it doesn't give error. 
//these complete methods are just like other normal methods i.e we can do overloading of these methods and overriding also.

public interface Default {
	default public void test() {
		System.out.println(100);
	}
	
	default public void test1() {
		System.out.println(200);
	}
	
	public void test3();

}
