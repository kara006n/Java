
public class A {
	//access specifier is just like the office card which specifies on what floors of office and in which building i am allowed
	//to visit like as developer my card will not have access to finance floor but the card of CEO will have access to everywhere.
	//so access modifier or specifier specifies where can this method or variable can be accesses or used
	
	//four types of access modifiers are private default protected and public
	//most restricted is private then less restricted than private is default then protected then public
	//to check there accessibility there are different situations like weather particular methods/variable is accessible in same class
	//or not then another situation is to check in different class but in same package but here also there are two types i.e.
	//different class in same package but they can be sub class or non-sub class.(u know the difference now)
	//another sitaution is different class in different package here again 2 more situation get created i.e. sub class or non-sub class
	//so total 5 situation get created now check accesiblity in these 5 situations. see notes there chart is given.
	
	
	//actually all these modifiers need to be tested for method and variables but what about class uske aage bhi public lagate hai
	//to baaki modifiers bhi laga sakte hai kya. so the rule is never make the class as private or protected. because private hogi then
	//jdk hi access nhi kr payega and protected hogi then hoga kuch i dont know its rule so remenber. only 2 modifiers are allowed for 
	//class i.e. public and default public mtlb  harr jagah accessible hai and default mtlb keval same package wale access kr sakte hai
	//class ko.
	
	//i got the answer for class not declared as protected because agr protected hogi then package me to sab access kr lenge class
	//ko lekin package ke bahar sirf sub-class hi access kr payegi..ab iski sub class hogi kon iske liye koi rule to hai nhi
	//mtlb koi bhi subclass ban sakta hai to phir ye to bilkul public jaisa ho gaya jb harr koi acess kr sakta hai aur kisi ko access
	//nhi krne denge to default jaisa ho gaya to phir protected ke liye kuc clear nhi hai....aur humne bas class level inheritance 
	//padha hai jisme class ke members ko access kr sakte hai ab agr poori class ko inherit krna hai to package level inheritance 
	//jaisi koi cheez honi chahiye java me jo ki hai nhi. so protected not allowed
	
	//ab dekho ek program me kitni cheeze hai class methods variable aur kuch bacha jo alag ho but program ke liye needed hai
	//haa constructors vo alag hai methods se to unke liye bhi access modifiers padho
	
	//pehla hai private agr constructor ko private bana diye then uska object nhi create kr sakte class ke bahar vo bhale same package
	//me ho ya different package me...sub class aur non sub class bhi check kiya maine mtlb agr maan lo koi class iss class ko extend
	//kr rhi hai same package me then kya uska object create kr sakte hai then error came that super constructor of base class not 
	//visible outisde class kyuki private hai woh mtlb vo bhi possible nhi hai kyuki extends krne ke liye bhi humme pehle base class
	//ka object automatically create krna padta hau lekin object create ke lliye constructor access hi nhi kr payenge kyuki private
	//hai lekin uss error me likha tha khud se constructor define kr sakte h(check yourself later)
	
	//if constructor is default then same package me object creation allowed hai...so we can see using constructor access modifier 
	//we can control access of class maybe not whole class but at least control acess over non static members of class as non static 
	//members depend upon object and using constructor modifiers we can control object creation
	
	//if contsructor is made protected then same as default wala case kyuki protected me aur default me sub class outside package
	//wala case different hota hai lekin yaha sub class create krne ke liye constructor chahiye aur constructor ko acess krne ke 
	//liye sub class hona chahiye so it becomes loop like job ke liye experience chahiye aur experience ke liye job.
	
	//actually the logic of protected i think is that jb bhi kisi cheez pe protected laga rhe ho then uska mtlb hai vo cheez ka
	// scope sub class me dekhna hota hai like if methods are protected then methods kiske andar hote hai class ke andar so class ki
	//subclass me iska scope rahega same tarah se agr class pe protected laga diya then class package ke andar hoti hai to jb
	//package inherit hoga to iss class ka scope vaha rahega lekin package inherit ka concept hai hi nhi issi tarah jb constructor
	//protected hote hai to iss class ki jo sub class hogi usme ye constructor accessible hona chahiye lekin ek rule hai
	//java ka ki constructors aur static members inherit hi nhi hote to phir unka scope sub class me dekhna hi kyu hai...jb baaki kisi 
	//member ko protected krte hai then woh member same package me aur jaha bhi sub class create hoti ye inherit ho jayega 
	//inherit ho jayega to accessible bhi hoga lekin rule ye hai ki constructor inherit hi nhi hote to unka scope ka concept hi nhi
	//aata
	
	
	
	//if constructor is public then we know well no restriction is there.

}
