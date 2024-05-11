package durga1;

public class NestedInterface {
	//nested interface ya nested class ka concept bas ye implement nhi krta ki jbtk outerclass ka object exist nhi krta 
	//tbtk inner class ka bhi nhi krega
	//concept yahi soch ke start hua hoga lekin phir jarurat ke hisab se usko modify kiya gaya like agr maan lo we want one class 
	//inside anothet class(classify krne ke liye ya koi aur reason ki wajh se humne maan lo ek class ko dusre ke andar rakh diya) but 
	//jarurat padne pe hum chahte hai ki directly inner class ko bhi call kr sake then inner class ko static bana do 
	
	//ab interface ke andar interface define kiya humne kisi bhi reason se maybe classification ke liye group kr diya or say ki 
	//ek interface dusre ke existence pe depend krta hai.
	//lekin yaha inner interface by default static aur public hoga kyuki interface ke members hamesha public hote hai taaki sab acccess
	//kr sake implementaton kahi se bhi ho sakta hai we don't know.....but ab inner interface ko static isliye rakha gaya hoga 
	//kyuki dekho outer interface ka object bana nhi sakte kyuki interface ke andar incomplete methods hote hai to agr inner interface
	//ko non static bana diya then outer interface ka object banana padega tbhi inner interface ko access kr paoge.
	//ab ye mt sochna ki iska object nhi bana sakte lekin isko class jo outer ko implement kregi uska object to ban sakte hai lekin
	//uss class ka object banne se pehle implementaion hoga class me interface ke methods ko vaha me implementation me methods ko hi
	//implement kr sakte hai interface ko implement krne ka feature nhi h(agr feature bana denge aisa to bahut complex ho jayega)
	//to isiliye inner interface ko static hi banao taaki dono pupose poore ho jaye one is ki ek interface ke andar dusra interface
	//rakh diya dusra ki inner wale ke implementation ke liye directly access kr sakte hai bina object banaye.
	
	
	//sir told without implementing inner interface we can directly implement outer(because if we will restrict implementation of inner
	//along with implementation of outer then it will be complex)......another logical reason may be is that during implementation
	//of interface we ignore static members as we know static members are not inherited so how can we implement them by overriding
	//so just ignore them so inner interface is static we know hence while implementing we can skip that and also we know inner
	//interface is static so for implementation we can directly access that.
	//reason for being declared static we already know so now they will follow all rules of being static.
	
	//since inner interface is static hence the concept of existence of inner interface object depends upon existence of outer interface 
	//object will no be valid here. object level pe bhale na ho valid lekin interface level pe abhi bhi valid hoga vo concept kyuki 
	//inner interface ko jb implement krenge tb bhi uske outer interface ke naam ke throught acess krenge.   
	
	
	//total four combination of interface and class nesting sir told no notes are available for these so refer lectures
	//last combo is class inside interface, this is used when functionality of class is closely related with and interface then 
	//we declare that class inside interface like for interface emailService there will be sendEmail method and in that method 
	//argument will be emailDetails. so to store details of email class named emailDetails is created but this class will be needed 
	//inside this interface only nowhere else.
	
	
	//in second combo we studied interface inside class(useful when in class we require multiple implementation of interface) there
	//interface declared inside outer class must be static because the implementation of that interface is provided in that class
	//itself so if not static then without creating object we can provide implementation but for static members of class we can do 
	//anything with them in class...can acess anywhere can change them etc. 
	
	

}
