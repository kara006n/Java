package collections_1;
import java.io.Serializable;
import java.util.*;
//program to check 
public class A {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		ArrayList a = new ArrayList();
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(a instanceof Serializable);
		System.out.println(a instanceof Cloneable);
		System.out.println(a instanceof RandomAccess);
		
		
	}
	
	//study difference between
	
	//array and collections
	//collection and collections
	//ArrayList vs Vector
	//array vs ArrayList
	
	/*ArrayList vs LinkedList----------->
	
	*1: ArrayList is best suited when retrieval operation is required but LinkedList is best suited when insertion/deletion in middle 
	* is required
	*2: in ArrayList memory location is continuous(i.e. why random access is easy) but inn LinkedList memory allocation is 
	* non-contiguous(i.e. why random access is time consuming task)
	*3: ArrayList is worst for insertion/deletion in  middle and LinkedList is worst for random access 
	*/
}
