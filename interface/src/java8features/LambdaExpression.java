package java8features;
//here i have created lambdaexpression functional interface then i have created class named LambdaExpression1  which implememnts incomplete 
//function of this interface.
//to implement the method of this interface in the class we require minimum of 6 steps but usings lambda expession we can do same work in 2 steps.
//actually 6 steps are first implements interface then second override method then 3rd write code in the method then 4th write main method then 
//5th create object of class then 6th call the method of interface
//using lambda expression we can shorten this
//can't use this lambda expression everywhere but somewhere
//how to use lambda expression
//don't implement class dont override method just write main method then create refrence variable of interface then equate it to method of interface
//now to refer to method of interface just use paranthesis no need to se name of method as its functional interface only one method will be there
//so to refer to it just write () if there were arguments then write those arguments in paranthesis, then put lambda sign by -> then use curly brace 
//complete the method and its done. 
//now we can call this method using interface reference variable. see example in class LambdaExpression1


@FunctionalInterface
public interface LambdaExpression {
	public void test();
}
