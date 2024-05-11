package collections_1;
//List methods
import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList a =new ArrayList();
		ArrayList a1 = new ArrayList();
		
		
		
		a.add(0,"a");
		a.add(1,"A");
		a.add(2,"B");
		a.add(3,'B');
		System.out.println(a);
		a1.add(0,"c");
		a1.add(1,"D");
		a1.add(2,"E");
		a1.add(3,'F');
		a1.add(4,"E");
		System.out.println(a1);
		a.addAll(1, a1);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.set(0, "Z"));//returns object removed
		System.out.println(a);
		System.out.println(a.indexOf("E"));
		System.out.println(a.lastIndexOf("E"));
	}

}
