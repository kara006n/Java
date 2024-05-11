package durga1;

public class Anonymous {
	/* Popcorn p = new Popcorn(); here we are creating object of popcorn class
	 * 
	 * Popcorn p = new Popcorn()
	 * {
	 * 	;;;;;;
	 * };
	 * difference in this design is here we are not writing semicolon after line 6 instead we have taken curly braces and then after
	 * curly braces we have written semicolon. 
	 * what is the meaning of this lets see......curly braces symbolizes class without name but this braces are written after line 6
	 * it means this anonymous class is extending Popcorn class means we are creating child class of popcorn.... now what is 
	 * significance of full line 6 (one point is that anonymous class is child class of whatever class object we are creating there)
	 * another significance is there the line new Popcorn() signifies that we are creating the object of that anonymous child class
	 * but we know our anonymous class doesn't have name so we are creating object using name of parent class and we are storing
	 * the address of child class object in reference variable of parent class(Popcorn p).... and the semicolon at last signifies
	 * the completion of object creation step.
	 * 
	 * using new Popcorn() we are told we are creating object of child class not parent class how to verify that...the reference 
	 * variable in which we are storing this object call getClass().getName() method on that object
	 * 
	 * 
	 * we are creating this anonymous class inside other class that may be test class or anything else that's why its called inner 
	 * anonymous class.
	 * 
	 * suppose we have popcorn class having 100methods now we are not satisfied with any method let say p1 then what we can do is
	 * create a child class of ppcorn and then override that p1 method but suppose this is only one time requirement then why to 
	 * create permanent object for this we can create anonymous class for that....like agr saal se ek baar travel krna ho then hum
	 * bus ka pass nhi banwate hai.
	 * 
	 * */
}
