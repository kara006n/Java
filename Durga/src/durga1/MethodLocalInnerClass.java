package durga1;

public class MethodLocalInnerClass {
	//let say we have method in our class and that method contain 50k lines of code but in that code we have some section that is used
	//again and again then if it has been c/c++ then we must have made the function of that code and can call that function whenever 
	//required but in java we don't have nested methods(c/c++ is modular programming language in which we can develop any number of method
	//in any fashion and call them whenever required but java is not like that is has to follows some rules and design of program)
	//so in java we declare class to build method then ye can call this method of class whenever reuired.
	
	int z = 20;
	public void m1() {
		//int z = 10;
		//until java 1.7 this variable should be declared as final then only methods of inner class can access it as in line 18 
		//but after java 1.8 version no need to do that i think because it will become final by default just like abstract methods
		//defined in interface.
		//the reason behind this is that the variable of method are created in stack and then when inner class is created the its 
		//object get created in heap now think of situation after method call of that method is over then it will be poped of the stack
		//but let suppose we have saved the object refrence of inner class using some global refrence variable then when we will call
		//the method m2 of inner class which is trying to access local variable of method m1 then it will get error because method m1 
		//is poped out so its variable will also not be existing
		//but when those variable are decalred as final so we know final variable value don't get change hence value of those variables
		//are replaced with variable name during compile time so in line 27 instead of z 10 will be replaced so when we call m2 method 
		//of inner class will be called then control will get to line 26 directly and noneed to acess z because it has already been 
		//replaced.
		class Inner{
			
			public void m2(int x, int y) {
				System.out.println(x+y);
				//System.out.println(z);
			}
		}
		
		Inner i = new Inner();
		i.m2(10, 20);
		;;;;
		i.m2(100, 200);
		;;;
		i.m2(1000, 2000);
	}
	//variables declared inside any method are local variables hence they cann't be declared as public private protected etc because
	//there scope is inside that method only so no need for those modifiers(but they can be final) similarly inner class defined inside 
	//method can't be public private etc but they can be final and abstract also but not both same time.
	public static void main(String[] args) {
		MethodLocalInnerClass m = new MethodLocalInnerClass();
		m.m1();
	}
}
