package collections_1;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap ihm = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		ihm.put(i1, "neil");
		ihm.put(i2, "hero");
		System.out.println(ihm);
	}
}
