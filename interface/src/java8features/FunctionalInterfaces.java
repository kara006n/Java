package java8features;
//in functional interface we write annotation @FunctionalInterface at top of interface.
//as soon as interface is defined as functionalInterface by writing annotaion we get the error because its blank and we need exactly one incomplete
//method in Functional Interface.


@FunctionalInterface
public interface FunctionalInterfaces {
	public void test();
	
	public default void test1() {//can contain any number of complete methods
		System.out.println(100);
	}

}
//interview question
//can we do multiple inheritance on functional interface?
//when we do multiple inheritance more than one incomplete methods get inherited but we know functional interface can have only one incomplete method
//do example define 3 interface declare everyone as functional interface and we will see we can't do multiple inheritance.
//one idea that comes in mind is what if two parent interfaces in multiple interface are not functional let they be just normal interfaces where
//one interface contains single complete methods and other one contain one incomplete method then when we will inherit these interfaces in functional 
//interface will they work, because now functional interface will have only one any incomplete methods.
//yes they will work i have tested. also if between 2 parent one is functional interface and other is normal interface not having any incomplete
//methods then also they will work


//one case in which it didnt work is let suppose we have 3 interfaces A,B,C where B and C are parent interface and A is child interface in 
//inheritance and child interface A is functional interface also. now if B conatin incomplete method and C is marker interface means no method
//neither incomplete not complete then we get error in inheritance.