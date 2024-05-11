package iib;
//as the name suggest instance initialization block it is used to initialize all intance variable at one place.
//IIB is the block of code which will get executed only when object is created then how it is different from constructor, actually constructor ka 
//maine logic diya tha ki agr object create krne se pehle tumhe kuch instruction perform krna hai ya kuch special computation hai then uske liye 
//contructor use kiya jata hai lekin IIB saare instance variable of ek jagah initialzie krne ke liye use hota hai isse code ki readablity badhti hai 
//clean code lagta hai jb sab cheez ek jagah rehta hai(ek jagah sab initialize honge to accha lagta hai vrna sab idhr udhr rahenge to muskil hoga).
//issi IIB me hum print bhi kara sakte hai values

public class A {
	{
		System.out.println("IIB");
	}
	
	A(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		
		
	}

}
//rest simple concept see notes
