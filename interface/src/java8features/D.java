package java8features;
//this program i have written just to test different types of methods in interface.

/* default static abstract can't used in any combination in interfaces
kyuki sabka alag importance hai abstarct vaha lagate hai jaha incomplete hoga kuch
default complete method likhne ke liye lekin non-static methods ko complete krne ke liye
and static methods ko power di gyi hai complete rehne ki kyuki incomplete honge to kabhi complete kr nhi payenge because inherit nhi hote hai ye
 */
public interface D {
	int x = 10;
	abstract public void test();
	default public void test1() {
		System.out.println(100);
	}
	
	static void test2() {
		System.out.println(200);
	}
	
	public static void main(String[] args) {
		System.out.println(D.x);
		D.test2();
		
		
	}

}
