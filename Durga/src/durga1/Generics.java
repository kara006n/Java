package durga1;
//many things are missing in notes we need to refer to lectures for details.
public class Generics {
	//one thing i learnt in generics is that super keyword can also used here to refer to superclasses
	//while defining generic class along with T we can't use super because in generics super is not allowed with T
	//but in generics method we can use super along with ? example
	//public void m1(ArrayList< ? super Number> l)
	//here the method m1 is taking array list as argument of type Number and all its superclass
	//? means array list can be of any type but super says it can be of type Number or of it's superclass type
	//in collection we know parameter types can be of Class types not primitive types i.e. why we are saying super refer to Number class
	//or it super class(class word is main focus)
	
	/*let's see all types:
	 * m1(ArrayList<String> l)
	 * this method can accept array list of string type only
	 * 
	 * m1(ArrayList<?> l)
	 * here this method can accept array list of any type
	 * 
	 * m1(ArrayList<? extends X> l)
	 * in this method it depends whether X is class or interface
	 * If X is class:  then here we can pass array list of either X type or it's child classes
	 * If X is interface: then here we can pass array list of either X type or it's implemented classes
	 * 
	 * m1(ArrayList<? super X> l)
	 * If X is class then we can pass array list of either X type or it's super classes
	 * If X is interface then we can pass array list of either X type or it's super classes of implementation classes of X.
	 * like for example runnable interface it has implementation class thread and this thread is child class of object or can say
	 * super class of thread is object(imagine figure). hence object is super class of implementation class of runnable
	 * 
	 * m1(ArrayList<?> l) advantage of this method is we can pass any type of array list to it its generic version of method it doesn't
	 * put any restriction on method that we can accept only particular type of array list only hence this feature saves memory because
	 * no we don't have to write same code for different types of array list. but this generic version has got this advantage that we
	 * can call this method by passing any type of array list but we know if someone has got advantage then there is also some disadvantage
	 * in them here the disadvantage is we can't add anything in the array list inside this method(because we don't know the type
	 * of array list hence we can't add anything except null) advantage is we can only perform read only operations in this method.
	 * 
	 * m1(ArrayList<? extends X> l) in this type of methods also we don't know the type of array list passed to the method because here
	 * array list can be either of X type or it's child class if X is class OR it can be of it's implementation class if X is interface
	 * hence we cann't add to it here also except null, we can only perform read only operation.
	 * 
	 * m1(ArrayList<? super X> l) in this type of method there is flexibility that we can add object of either X type or null.
	 * 
	 * 
	 * */

}
