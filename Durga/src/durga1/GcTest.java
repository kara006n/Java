package durga1;
import java.io.*;
/*
 * here i will intentionally create objects of our class so as to create memory problem and then will see if garbage collector
 * gets called or not automatically... we will override finalize method so that we get to know when garbage collector got called
 * whenever an object of our class will be deleted then our finalize method will be called.
 */
public class GcTest {
	static int count=0;
	public void finalize() {
		System.out.println("finalize method called "+ ++count);
	}
	public static void main(String[] args) {
		for(int i =0; i < 10; i++)
		{
			GcTest g = new GcTest();
			g = null;
		}
		
	}	
}//now keep increasing value of i from 10 to whatever value and see when garbage collector gets called
