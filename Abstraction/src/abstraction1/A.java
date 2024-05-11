package abstraction1;
//a class can be made abstract we have already heard..what is abstarct class, it a class which can be 0 to 100% incomplete,,,,what the logic behind 
//this, humne interface banaya tha kyuki class ka perspective ya overview dikhane ke liye ussi tarah abstarct class ka bhu use pada hoga like
//ki humne ek class develop kr li hai lekin usme kuc methods abhi implement nhi kr sakte uska logic abhi design nhi kiya gaya hau lekin class banana 
//hai hume to kya kre usko(class) abstarct bana do taaki jo methods complete hai unko define krdo jo incomplete hai unn methods ke aage abstract laga 
//ke incomplete chor do...lekin yaha interface ki tarah abstract keyword optional nhi hai balki must hai...class me bhi abstract lagega aur incomplete
//method me bhi lagega.

//unlike interface yaha pe hum sab create kar sakte hai static non static members(variables and methods) constructors bhi define kr sakte hai main
//method bhi define kr sakte hai bas object create nhi kr sakte kyuki kuch methods incomplete hai....ab yaha se smjh aa raha hoga ki ye bhi ek normal
//class hai jisme kuch development baaki hai isliye usko abstract declare kiya hua hai,,jaise hi woh methods complete kr doge ye class ek normal class
//ban jayegi....lekin ineterface alag cheez hai usko develop krne ka reason hi alag tha usme sab kuch nhi kr sakte hai.

//interface ya abstract class me jb object create nhi kr sakte then main method likhne ka logic kya hai..actually main likhte hai taaki static methods
//aur variables ko access kr sake kyuki inko yahi se best access kiya jaa sakta hai(kyuki inherit nhi hote hai ye)

//multiple inheritance not allowed in abstract class because its a class not interface

abstract public class A extends B{
	
	//can define static & non static members along with abstract method
	//can't create object of this class
	int x = 1;
	static int y = 2;
	public void test() {
		System.out.println("test");
	}
	public static void test1() {
		System.out.println("test1");
	}
	
	public abstract void test3();
	//can define main in abstract class
	public static void main(String[] args) {
		A.test1();
		System.out.println(A.y);
	
	}
	
	//whenever we are creating class and writing the name of class there will be checkbox for abstarct class select it and automatically
	//abstract class will be created.

}
