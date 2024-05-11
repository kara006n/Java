package interface_3;
//multiple inheritance is possible in interface and child class can be interface or class means here C can be interface or class no matter
//interface will still exist


//also there can be case when A is class and B is interface and C is again class then in that case also inheritance will exist (its multiple inheritance)
//in that case class C will be like Class C extends A implements B. point to note here is that order is important first it will extend then implement
//trick to remeber is alphabetically which letter comes first should be first
public interface A {
	public void test();
	//actually here we know this method is incomplete so in java whenever we will have incomplete methods then always remember to use abstract keyword
	//signature of method...but here we can see we haven't used it but still no error because its added automatically(so optional).
	
	//wherever abstract will be used means it is incomplete and it is actually used in two places i.e. methods and classes 
	abstract public void test2();

}
//interview question
//can we have static incomplete method...no because if we have incomplete method means we need to inherit in class and complete it but static 
//methods are not inherited so what's the point of writing incomplete methods

//empty interface is marker interface used in serialization and de-serialization.

//whenever creating class there is option of interface in that click add button and select interface to be added and it will implement automatically.


//variables in interface but before learn final keyword.
//every variables in interface is by default static(kyuki object create nhi kr sakte) and final(agr yaha interface me variable de rhe hai mtlb jaruri 
//hoga to final krdo)  aur isi wajh se isko initialize krna jaruri hai interface me hi


//java 8 new feature
