package collections_1;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("Neil",200);
		h.put("Alok",300);
		h.put("Shivansh",400);
		h.put("Vishal",500);
		h.put("Ravi",600);
		System.out.println(h);
		System.out.println(h.put("Neil",1000));
		System.out.println(h);
		Set s = h.keySet();
		System.out.println(s);
		Collection c = h.values();
		System.out.println(c);
		Set s1 = h.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			HashMap.Entry he = (HashMap.Entry)itr.next();
			System.out.println(he.getKey()+"---"+he.getValue());
			if(he.getKey()=="Neil")
			{
				he.setValue(2000);
			}
		}
		System.out.println(h);
	}
}
