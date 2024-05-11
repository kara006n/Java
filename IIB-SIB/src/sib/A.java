package sib;
//one thing that i have tested is during this program is that in constructor we can make another request for object creation and it will runn
//will not give error. but loop will be formed to solve that define one static variable and write if condition on how many times we want this loop to
//run. but i thought earlier ki aisa nhi hoga contructor jbtk poora run hoga tbtk object kaise create ho sakta hai but that's not true.
//logic smjh nhi aaya lekin.
public class A {
	//SIB
	static {
		System.out.println("SIB");
	}
	//IIB
	{
		System.out.println("IIB");
	}
	//Constructor
	A(){
		System.out.println("Constructor");
	}
	//main
	public static void main(String[] args) {
		System.out.println("From Main");
		A  a = new A();
		System.out.println("End Main");
		
	}
	
	//for rest examples see notes simple hai
	

}
