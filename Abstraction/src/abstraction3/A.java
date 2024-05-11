package abstraction3;
//abstraction is hiding of implementation details and this features is achieved in java using interface and abstract class because there are incomplete
//methods so there implementation logic is not known hence its abstraction.

//abstraction and data hiding are different
//abstraction is hiding implementation details of methods but data hiding is applicable on variables by hiding them by making them private so that 
//they are not accessible outside class.

//we can't create constructor in interface because there object cann't be created then how will the constructor will run. but we can have constructor in
//abstract class..the reason may be is in interface we don't have non static variables all the variable are by default static and final so they cann't 
//be changed. but in abstract class there are non static variables...lekin yaha constructor ki jaarurat kyu hai inko jis class me extends krenge jaha 
//pe incomplete methods ko override krenge vahi initialize krdo variables ko bhi kyuki vo inherit to ho jate hau lekin nhi reason ye hai ki
//pehli baat methods ko overrie krke content change kr sakte hai lekin variables ko overrride nhi kr sakte agr dobara ussi naam se child class me variable 
//define kr diye to vo data hiding ho jayega mtlb vo variables parent class ke variables ko hide kr denge ...to isiliye constrcutor chahiye abstract class me 
//taaki uss constructor ko child cclass se call krke iske variables ko initialize kr sake jb iss class ke incomplete methods child class me complete ho jaye 
//tb to ye abstract class nhi rahegi tb iska object create ho sakta hau then constructor ki jarurat padegi ab child class ke constructor se parent class ke
//variables ko initialize nhi kr sakte vrna vo data hiding ho jayega isliye.

//constructors are never inherited
public class A {

}
