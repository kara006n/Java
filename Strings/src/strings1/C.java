package strings1;
//getting all methods of Class B in package
import java.lang.reflect.Method;

public class C {
	public static void main(String[] args) {
		//class ke data to store krne ke liye Class ka object banate hai
		//method ke data ko store kren ke liye method ka object banate hai
		//in dono hi objects me kuch methods honge unka use kr rhe hai bas hum
		
		Class c = B.class;
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1.getName());
		}
		
		//getting name of class using object 
		//here getclass() methid is present in object class
		//b.getClass() gives the Class object saved in Class
		//now Class has getName method so use it to get the name
		B b = new B();
		System.out.println(b.getClass().getName());
		
		//OR
		System.out.println("\nAnother way to do samething\n");
		
		B b1 = new B();
		Class c2 = b1.getClass();//will return current class defination
		System.out.println(c2.getName());
		Method[] m2 = c2.getDeclaredMethods();
		for(Method m3 : m2)
		{
			System.out.println(m3.getName());
		}
		
	}
}
