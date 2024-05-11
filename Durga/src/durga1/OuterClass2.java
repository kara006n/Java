package durga1;

import durga1.OuterClass.InnerClass;

public class OuterClass2 {
	class InnerClass{
		public void m1() {
			System.out.println("Hello Inner class Method");
		}
	}
	
	public void m2() {
		//here we can see that i havenot written refrence variable of inner class as OuterClass.InnerClass kyuki abhi hum outerclass 
		//ke andar aa chuke hai ab location specify krne ki jarurat nhi hai. pehle jb main ke andar yahi kaam kr rhe the then hume 
		//ye make sure krna tha ki pehle outer class ka object ban gaya ho then inner class ka object banana the age dot wala system
		//na use krte to phir iska mtln ye tha ki innerclass ka object direct bhi ban sakta tha lekin nhi 
		//dot wala system ye make sure krta hai ki inner class ka object outer class ke object banne ke baad hi banega lekin yaha
		//abhi hum non-static method k andar hau mtlb ye code jb run hoga outer class ka object ban chuka hai ab inner ke object ko 
		//direcltly bana sakte ho no issue 
		
		//aur refrence variable me bhi humne OuterClass.InnerClass nhi likha kyuki vaha isliye likhe the taaki bata sake uska khud ka 
		//existence nhi hai koi lekin yaha outer ke object ke andar hai to ye bataneki jarurat nhi hai abhi like ki bahar wala koi
		//naam pooche to baap ke naam ke saath batana padta hai taaki tumhari pehchan ho sake lekin ghr ke andar uski jarurat nhi hai.
		InnerClass i = new InnerClass();
		i.m1();
	}
	
	//we know this keyword refers to current class obect similarly inside inner class this is used to refer to current class object
	//and to refer to outer class object we use Outer.this.......for inner we can also use Inner.this instead of direct this
	public static void main(String[] args) {
		OuterClass2 o = new OuterClass2();
		o.m2();
	}

}
