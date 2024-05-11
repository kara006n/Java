package p1;
//package is nothing but folder to organise different types of files in our project nad to keep track of different file of project
//name convention for folder is same as name convention for variable i.e. first letter should not be capital,,whole name should not 
//be capital,, name should not start with any symbol other than $ ans '_' .......these are not rules but convention of language
//to be followed. keyword cannot be used for naming of package. no space between package is allowed.

import p1.p2.p3.B;


//package should be first statement in out project because it symbolize where out java file is present after package import statement 
//is used....import is use to import java file present in some other folder or package...actually any class can access any other class 
//present in same package but classes resent in other package are not acccessible so we need to import them. shortcut to import is just
//create object of that class which is outside package it will give error press ctrl+1 then it will automatically import the needed 
//class of different package.

//when we will create package while giving name we can write name as com.unacademy.project  ...actually this means it will create 
//3 folder one inside other i.e. first folder is com inside it is unacademy then project...it shortcut way to create folders.
//the concept of packages is inside source folder i.e. src ...first we create project its also a folder inside it there is src folder
//inside src we create package because all files of project will be there only and main organizing of files is needed there so there
//comes concept of package

//let we create a package name p1.p2.p3 then 3 folders are created now inside these we create a java class named A.  now let suppose 
//we want to create a file name A again but inside p2 folder then how to do that....then in left side go to navigation and find the 
//package named like p1.p2.p3 then right click on that and find create class then while creating class it will show the location where
//this class is created it will be written there like p1.p2.p3 now edit that to p1.p2 hence done now this java file will be created in
//p1.p2 folder....in left side in navigation we will se 2 packages as p1.p2.p3 and other one p1.p2   .....don't confuse with these
//name p1.p2.p3 then p1.p2 i mean what are these why two times p1.p2 in both are written these are actually address of java file...like
//address of java file named B.java is p1.p2.p3 and address of java file named c.java is p1.p2

//also we can create java file with same name if the files are present in different package

//here we can see two classes B and D these are actually non-sub class but if any class between 2 extends from another one then one 
//become sub class and another one become super class.

//if we want to import all classes of different folder then we have regular expression like to import all file of p1.p2.p3 folder the
//regular expression is import p1.p2.p3.*







public class A {
	
	public static void main(String[] args) {
		E e = new E();//we have created object of other class.no error because same package
		e.test();
		
		B b = new B();//this is possible because we have imported this class
		b.test();
		
		//now let suppose we wnt to import class named B present in p1.p2 and p1.p2.p3 but the issue is how to distinquish them
		//like if we write import p1.p2.B then we can only create object of B class from p1.p2 not from p1.p2.p3 and if we write
		//import p1.p2.p3.B then we can only create object of class B present p1.p2.p3
		//soo the solution is write both classes as p1.p2.p3.B and p1.p2.B this way we can distinguish both B class.
		//so now we got another way to import classes without import statement. so package resolves naming convention in java
		//as now we can have 2 java class with same name in one class because of packages concept.
		
		p1.p2.B b1 = new p1.p2.B();
		p1.p2.p3.B b2 = new p1.p2.p3.B();
		
		//we have created object of both classes named B now.
		
		
		
	}

}
