package inheritance_1;

public class A {
	//inheritance means taking xerox copy like diabetes is inherited from parents it means a xerox copy is provided to us 
		//and now we both hai there own copy, sharing knowledge is also inherited property after sharing data doesn't get lost from teacher
		//now both teacher and student both have knowlwdge there own copy but land is no inherited because when it is passed from parent to
		//child it is gone from parent he doesn't have it now.
		
		//class from which inheritance is done is parent/super class and inherted class is subclass/child class. extends keyword is used 
		//to implement inheritance...main is written in child class as we want to run child class now
	A(){
		System.out.println("hello");
	}
	//intentionally i have created this constructor to check that wheather object of class A is created or not
	//before creating class B...because how class B gets non static content of class A
	//so in inheritance first super class is made to run so its static members and function get live i.e. get some memory
	//and also its object is created so that its non static members will get some memory in heap because then only class B can take 
	//these values.
	//object create krna islye bhi jaruri hai kyuki class A ke characteristics uske saare members and functions pe depend krte hai...kayi
	//baar kya hota hai hum data members of class initialize nhi krte hai jb object create hota hau then computation krke values initialize
	//krte hai aur yahi values uss class ki characteristics show krta hai aur sharing krte time hum real characteristics of class 
	//share krna hai isliye object create krna jaruri hai
	//object create na karna mtlb ye jo non static members hai ye bas line of code hai inki values kahi save nhi hai ki koi copy kr lega
	//isliye copy krne ke liye object creation must h.
	
	int x = 10;
	public void test() {
		System.out.println(100);
	}
	
	//in inheritance we will have 2, 3 or more classes in one projects...why can't we make all classes in one java file...this can be
	//done but then finding particular class will be difficult now we know whatever is name of java file that class will be present in it.
	//also if we put all classes in one java file then only class which matches the file name of java file can be made public others 
	//should not be public otherwise error will be there.....why soo...its rule
	
	//one class cann't inherit from multiple class at same time because design will be complex...if it will be allowed then developer will
	//inherit any class from anywhere sometime cycle or loop will also formed now if some new person need to track inheritance then it will
	//be tedious task.
}
