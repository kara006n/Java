package java8features;

public class LambdaExpression1 {//due to lambda expression here implements is removed

//	@Override
//	public void test() {
//		System.out.println(100);
//	}
//	
//	public static void main(String[] args) {
//		LambdaExpression1 l = new LambdaExpression();
//		l.test();
//	}

	
	public static void main(String[] args) {
		LambdaExpression l = ()->{
			System.out.println(100);
		};//here write semicolon, here no object is created to access non static member of class so its called functional programming so after java 
		//version 8 it now support functional programming\
		
		//so here no implements no overriding no object creation nothing
		
		//when we are writing the logic of method the if the logic is of 1 line the no need to write curly braces({}).
		
		l.test();//now call the method
	}
}

//some features about interface that get added in version 8 of jaava are:
//we can write main method in interface and call them also we can write complete static methods in interface now and call them using main
//this all is done with requirements. this means incomplete static methods are not allowed but complete are allowed.

//an reference variable of interface can be created but object of interface cann't be created in java 8 write program and check.
