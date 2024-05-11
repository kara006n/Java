package durga1;

public class FinalizeDemo {
	static FinalizeDemo s;
	
	public void finalize() {
		System.out.println("Finalize method called");
		s = this;
	}
	public static void main(String[] args) throws InterruptedException {
		FinalizeDemo f = new FinalizeDemo();
		System.out.println(f.hashCode());
		f = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(s.hashCode());
		s = null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("end of main");
		
	}
}
/*here what program is doing lets see first we have created static reference variable so that we can use this reference anywhere in
 * program. then in main method we have created  object of our class then we printed its hash code so that we can identify later if 
 * object is same or another. then we made this object eligible for garbage collector by pointing its reference variable to null
 * but still garbage collector will not delete it so we have to request garbage collector by system.gc() method then a daemon thread
 * will be created by garbage collector. so we will have two thread now to make garbage collector thread to work first we will make
 * the main thread to sleep for 5sec. now the daemon thread will run the finalize method where it will print message then allot 
 * new reference variable to our same object which was going to destroy. then work of daemon thread get finished and till then main
 * thread will also wake up now it will print hash code of object pointed by s and we will see it is same object that was created before
 * now we will make this object available for garbage collection once again now will call System.gc() method. now again one thread will
 * born so to let that thread finish it work first i will make main thread to sleep for 10sec now. that new thread will now delete the
 * object without calling finalize method because no message will be printed now. then after 10sec main thread will wake up and call
 * end of main message. so here we will se finalize method is called once but object is made eligible for garbage collector 2 times  
 *
 * see program GcTest.java to see if garbage collector get called or not if memory problem is there in program
 */