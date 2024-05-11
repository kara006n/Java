package durga1;
//running this code will ask which class file to run because here two class files are there one is A.class and another is A$1.class
//and both have main methods therefore while running it will ask for which file to run.
//inner class is static method so it has its self existence if it was not static then no option of running inner class 
public class A {
	
	 static class Inner{
		public static void main(String[] args) {
			System.out.println("Neil");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Outer");
	}

}
