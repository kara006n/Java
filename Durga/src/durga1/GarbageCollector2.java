package durga1;

public class GarbageCollector2 {
	
	public void finalize() throws Throwable
	{
		System.out.println(10/0);
		System.out.println("finalize method called");
	}
	public static void main(String[] args)  throws Throwable{
		GarbageCollector2 g = new GarbageCollector2();
		//g.finalize();
		g = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("end of main");
		
	}
}
/* here point to note is that when we are putting 10/0 in finalize method then it's not printing second line i.e. finalize method 
 * called because while running finalize exception raised but JVM will ignore that uncaught exception(means no catch block) and 
 * terminate the running of finalize method and later control will come back to main and further program will run normally. but how can
 * we say finalize method is called if we
 * write 10/0 as second line in finalize then it will print finalize method called later exception will raise hence JVM will terminate
 * method control come back to main and rest code will execute. but if we call finalize method by ourself then when exception will raise
 * program will not run it will terminate abnormally.
 * 
 * another story of garbage collector is when JVM calls garbage collector then it will come and before destroying object it will say ask
 * your last wish then object will say to run finalize method to clear all connected resources so while running finalize method object
 * will be shivering that it will get destroyed and GC will be happy but lets suppose before completing finalize method in last line of
 * finalize we assign reference to this object then object will feel relaxed that it got saved somehow but GC will be angry and will
 * say "i will see you next time, next time i will not let you go", and the suppose after all this reference of object gets deleted 
 * again then when again GC will come it will instantly delete without even calling finalize because it will say i have once cleared 
 * all resources attached with object so no need now. so finalize method is executed inly once on object even if it is eligible for 
 * garbage collector many times.
 * 
 * program for this story is given in FinalizeDemo.java in this project
 * 
 */

