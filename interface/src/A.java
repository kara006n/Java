
public interface A {//iski defination we know why to use interface here we only declare methods not implementation.
	
//	public void test() {
//		
//	} will give error because complete
	//its actually incomplete in laymann terms but its called abstraction(hiding the details and showing necessary one is actually 
	//incomplete na isiliye incomplete ki jagah abstarction use krte)
	
	public void test();
	
	public void test1();
	//class to class interface is done using extends
	//inheritance interface to class we use implements but here we are inheriting incomplete methods but class cann;t have cincomplete
	//methods so must need to complete there is contract. this completion is done using overriding
	
	//also interface to interface inheritance is possible using extends keyword extends and implements word hi apna meaning samjha rhe
	//hai
	
	//class to interface inheritance not possible

}
