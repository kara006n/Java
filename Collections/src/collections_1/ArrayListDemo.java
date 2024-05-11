package collections_1;
import java.util.*;
//methods of collection
public class ArrayListDemo {
	
	static ArrayList a =new ArrayList();
	static ArrayList a1 = new ArrayList(10);//create array list of size 10
	
	public static void main(String[] args) {

		
		
		//methods of collection
		a.add("A");
		a.add(10);
		a.add('A');
		a.add(null);
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
		
		a.remove(2);
		System.out.println(a);
		a.removeAll(a1);
		System.out.println(a);
		
		a.addAll(a1);
		a.add("B");
		a.add(19);
		a.add("D");
		System.out.println(a);
		a.retainAll(a1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		System.out.println(a1.size());
		
		a.addAll(a1);
		System.out.println(a.contains("a"));
		System.out.println(a.contains("A"));
		System.out.println(a.contains('A'));
		
		a.add("B");
		a.add(19);
		a.add("D");
		System.out.println(a.containsAll(a1));
		
		Object[] a2 = a.toArray();
		for(int i=0; i< a2.length; i++)
		{
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		//using for each loop no initialization no updation  no size needed
		for(Object o: a2)
		{
			System.out.print(o +" ");
		}
		
	}

}
