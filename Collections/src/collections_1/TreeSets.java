package collections_1;
import java.util.*;
//from 1.6 version of java null in not allowed in treeSet completely firstly null was allowed for only elements in treeSEt but not it's
//not allowed.
//only in TreeSet and TreeMap heterogeneous elements are not allowed but in special case where natural sorting order is not needed or 
//defined then we can also add heterogeneous objects but internally they should be same type like(String and StringBuffer).
public class TreeSets {
	
	Integer x;
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Neil");
		Employee e2 = new Employee(102,"Alok");
		Employee e3 = new Employee(103,"Shivansh");
		Employee e4 = new Employee(104,"Vishal");
		Employee e5 = new Employee(101,"Tushar");
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
		
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}

