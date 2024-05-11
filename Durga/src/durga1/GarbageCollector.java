package durga1;
/*
 * let suppose java application want to interact with JVM it will ask how are you but JVM will reply tell me what u want as he knows
 * program has come for something then it will ask i want to create 1000 objects can you tell me current available memory in heap then 
 * JVM will give reply then it will ask what is size of total heap memory then it will get reply for that then java program will say
 * this much available memory not enough for object creation then it will ask JVM to run garbage collector then JVM will run garbage
 * collector to free memory..now for all this conversation to happen between java application and JVM we will require some methods 
 * and these methods will be existing in some class...because methods don't have self existence in java so we need a class for this
 * communication between application and JVM using object of that class we will do communication. 
 * 
 * why we have object in java why can't class do all work i think because class give definition but one want to run different copies 
 * of class so create your own object like example bank is class now every customer can't use same bank class because every customer
 * wants different requirement from class and same class cann't fulfill everyones need so create object now copies of class will be
 * created in memory can each copy can run independently can store its own data if we want something to share between all copies then
 * declare some methods and variables as static. like suppose there is some method which interact with operating system then we cann't 
 * allow this method to pass to every copy as then can put unnecessary request to Operating system and can disturb functioning hence 
 * make that method static so that one method of class will run every copy of class(object) will request this class to run that method.
 * due to static methods now class also have it's own existence in memory and will be running like objects.
 * 
 * lets come back to garbage collection...so that class which java application need to interact with JVM is runnable but it's 
 * singleton class i.e we can create only one object of this class so there is no constructor we have some factory methods to create
 * object of this class. i.e. Runtime r = Runtime.getRuntime(); ab yaha iska object kyu nhi create kr sakte kuch security pupose hoga
 * ya ye system se interact krta hoga isliye shayad kyuki agr system se interact krne wala method hoga then proper tareeka hoga isko
 * use krne ka isliye itna restricted banaya jata hai taaki normal functioning of system didn't get disturbed. getRuntime() is factory 
 * method to create object.
 * now using object of Runtime r we can call different methods like totalMemory(), freeMemory(), gc() to interact with JVM.
 * 
 * 
 * */
public class GarbageCollector {
	
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());//let suppose memory is 100byte
		System.out.println(r.freeMemory());//let memory is 60byte
		for(int i =0; i < 10000; i++)
		{
			GarbageCollector g = new GarbageCollector();
			g = null;
		}
		System.out.println(r.freeMemory());//let memory left now is 40byte
		r.gc();//garbage collector may or may not run
		System.out.println(r.freeMemory());//here now memory can be 30byte...how can it be less than 40byte after calling GC....
		//it will be in case where 10 bytes of memory got used for calling gc() method but JVM didn't run that immediately.
		//here memory can be of any size in different cases like gc() run but didn't cleared all objects etc etc.
		//memory after freeing can be more than 60bytes also because in line 35 it shows 35 may be there also some useless object 
		//present so after running GC all will be cleared
		//run and see the result
		//gc() method in System class is static but in Runtime class is instance method so should be called accordingly
		//we have 2 gc() methods but recommended to use runtime gc method instead of being it's lengthy process as first we have 
		//to create object of runtime then call gc() method...because internally in gc() method of system class it's creating object 
		//of runtime and calling its methods so why to do this when if system class is doing same thing may be by calling gc()
		//method by self creating object of runtime may be we can reduce one system call. press ctrl+point to method of system class
		//refer to gc() method there.
		
	}
	//before cleaning up object finalize method is called to perform deallocation of resources so this method is specific to class
	//hence every class should have it's own finalize method therefore finalize method is declared in object class itself so that every
	//class object have it, we can override it to perform activity specific to class.
	//declaration is protected void finalize() throws throwable
	//here in object class method is protected hence highly recommended to override this method in worst case we have to depend 
	//on this method.
	
}
