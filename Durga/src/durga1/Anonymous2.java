package durga1;



public class Anonymous2 {
	public static void main(String[] args) {
		Popcorn p = new Popcorn() {
			@Override
			public void taste() {
				System.out.println("spicy");
			}
		};
		
		p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
		Popcorn p2 = new Popcorn() {
			@Override
			public void taste() {
				System.out.println("sweet");
			}
		};
		p2.taste();
		
		System.out.println(p1.getClass().getName());
		System.out.println(p.getClass().getName());
		System.out.println(p2.getClass().getName());
	}

}

class Popcorn{
	
	public void taste() {
		System.out.println("salty");
	}
	
	public void p1() {
		;
	}
	
	public void p2() {
		;
	}
}
