package durga1;
/*normal thread program 
 * class MyRunnable implements Runnable{
 * public void run()
 * {
 * for(int i =0;int i<10;i++)
 * {System.out.println("child thread");
 * }
 * }
 * }
 * class ThreadDemo
 * {
 * public static void main(String[] args)
 * {
 *  MyRunnable r = new MyRunnable();
 *  Thread t = new Thread(r);
 *  t.start();
 *  
 *  for(int i =0;i<10;i++)
 *  {
 *  System.out.println("Main Thread");
 *  }
 * }
 * }
 *now see same program using anonymous inner class
 * */
public class Anonymous3 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Child thread");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();//here thread will start which will run thread code above
		
		//from here main thread will run
		for(int j=0;j<10;j++)
		{
			System.out.println("Main thread");
		}
	}
}
//another way of doing same thing is using anonymous inner class in method arguments
/*class ThreadDemo{
 * 	new Thread( new Runnable()
 * 				{
 * 				public void run(){
 * 				for(int i=0;i<10;i++)
 *				{
 *					System.out.println("Child thread");
 *			}
 * 				}
 * }).start();
 *above code starts new thread and will run its code
 *now below code will be run by main thread
 *for(int i=0;i<10;i++)
 *	{
 *	System.out.println("Main thread");
 *	}
 * 
 */