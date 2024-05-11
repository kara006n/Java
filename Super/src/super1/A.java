package super1;
//super name itself very clearly specifies parent class, in java parent class is called super class.
//so using super keyword we can access members of parent class...so one thing is very clear that super keyword is only used when there is inheritance
//because then only parent class will be there.


//ye sab mai pehle se assume kr raha hu jitna abhi tk sune hai mujhe lag raha hai super keyword aur this keyword same hai jaise this keyword 
//current object ka refrence hold krta hau aur uske constructor ko bhi call krta hai ab maan lo parent aur child class dono hai inheritance ke case 
//me to hume pata hai parent class bhi run hoti hai apne app uska object bhi create hota hai ab uske refrence ko hold krne ke liye koi chahiye na
//to uske liye super keyword banaya gaya hai jo ki same kaam krega uske members ko access krega aur uske constructor ko bhi call krega.

//sab kuch same hai shayad super aur this ka dono ko static method me define nhi kr sakte(not sure pehle poora padh lu)


//maine ek aur cheez padhi abhi ki harr class object class ka sub class hota hau mtlb inheritance hamesha hota hau java me isiliye shayad 
//super keyword banaya gaya hau...

public class A extends B{
	
	//variables are not overriden because parent methods are developed to operate on variables if they will be overriden then those parent class 
	//methods might fail.
	int z = 3;
	//static int x =4;//if this is declared then this will hide the variable of parent class
	@Override
	public void test1() {
		System.out.println("updated method");
	}

	public static void main(String[] args) {
		A a = new A();
		a.test3();
	}
	
	public void test3() {
		this.x = 5;//here i am changing the varaible x that is inherited from parent class but i can  see when i try to visit this variable using super
		//then its values is also changed this might be because we have not declared variables x in class A it is inherited from B. all characteristics
		//of class depends upon its variable and we havn't declare variable(x) in class only z is declared. so when we change x then parent class ke 
		//variable ki value change ho rhi hai.
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		this.test();
		this.test1();
		System.out.println(super.x);
		System.out.println(super.y);
		super.test();
		super.test1();
	}

}
