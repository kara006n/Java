package durga1;

class Cat implements Cloneable{
	int ca;
	
	Cat(int c){
		this.ca = c;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Dog implements Cloneable{
	Cat c;
	int d;
	
	Dog(Cat c,int d){
		this.c=c;
		this.d=d;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Dog cl = (Dog)super.clone();
		cl.c = (Cat)c.clone();	
		return cl;
		
	}
}

public class DeepClonoing {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c1 = new Cat(20);
		Dog d1 = new Dog(c1,10);
		Dog d2 = (Dog)d1.clone();
		System.out.println(d1.c.ca+"  "+d1.d);
		d2.c.ca = 999;
		d2.d = 888;
		System.out.println(d2.c.ca+"  "+d2.d);
		
		
		
	}

}
