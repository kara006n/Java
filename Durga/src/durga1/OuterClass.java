package durga1;

public class OuterClass {
	class InnerClass{
		public void m1() {
			System.out.println("Inner class Method");
		}
	}
	
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		//yaha dekho ho kya raha hai hume inner class ka object banana hai to pehle outerclass ka banega kyuki outer ke bina inner
		//ka existence nhi hai to outerka bana liya humne pehle
		//ab inner ka bananna hai to main method jb hum run krte hai then usme agr kisi ka object create krte hai then JVM uss clas
		//ke name ki file me jayega then uss file me public class jo uthayega or object create kr dega
		//lekin inner class ka system aisa nhi hai yaha uss class tk pahuchne ke liye pehle outer class ka object banao then outer
		//class ke object refrence ke through i.e. by using dot operator hum vaha ya bole uss area me pahuchenge jaha inner class 
		//present hai ab new operator ke throught object create kr sakte hai inner class ka isiliye we have written o.new InnerClass()
		//ab iss object ka address ek refrenc variable me store krna hoga jo ki inner type ka hoga.
		//let i be that refrence variable and uska type kaisa hoga class name ke type ka hoga ab class name hai InnerClass 
		//lekin uski self existence nhi hai isiliye usko outer ke saath use krte hau like .class file me OuterClass$InnerClass likhte 
		//hai lekin java file me $ ki jagah dot use krte hai.
		OuterClass.InnerClass i = o.new InnerClass();
		i.m1();
		//OR
		
		//we can combine above two lines also then it will bw more meaning full lets seee but before that
		//declaring refrence variable like OuterClass.InnerClass i; here writing OuterClass.InnerClass ye mt sochna ki yaha inner
		//ka refrence variable dot ke through access kr rhe hai OuterClass ke meber ki tarah.....aisa kuch nhi hai yaha inner ka 
		//refrence variable hum main method me create kr rhe hai to likhna chahiye the InnerClass i lekin inner class ka kuch ka 
		//existence nhi hai isliye OuterClass.InnerClass iss tarah likhte h
		
		
		//for combinig lines
		OuterClass.InnerClass i2 = new OuterClass().new InnerClass();
		//this will seems meaningful pehle outer ka object create kiya then uss object ke through inner ka object create kiya
		i2.m1();
		
		
		//OR
		new OuterClass().new InnerClass().m1();
		
		//now see other praogram named OuterClass2.java
	}
}
