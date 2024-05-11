package exception1;
//most important topic for interview
public class B {
	public static void main(String[] args) {
		try {//we will put that code in try block which we think will give exception
			//now whenever the exception will rise from any line of code in try block then try block will create exception object(to handle this exception)
			//and will return the address of this object to catch block and once catch block gets the address of object it will suppress the exception.
			// using System.out.println(e); we are printing the message returned by exception.
			//actually the exception class to handle all these exceptions is already provided by java... 
			//exception is built in class try block create object of exception and give to catch block which stores address of object in e but when we 
			//print e this will print message because this is special object (otherwise when normally we print e then it should print object address)
			int x = 0;
			int y = 10;
			int z = y/x;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Welcome");
	}

}
