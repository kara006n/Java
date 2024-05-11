package strings1;

public class A {
	public static void main(String[] args) {
		String s1 = "neil";
		String s2 = "ne"+"il";
		System.out.println(s1==s2);
		String s3 = "ne";
		String s4 = s3+"il";
		System.out.println(s1==s4);//string are immutable we know.....for every string constant there object is created in string pool
		//so for "ne" and "il" object will be created in string pool but after performing concatenation method as we know + is 
		//concatenation so this new object is created at run time hence it will be created in heap. this is same like we have done
		//when we create string object using using new keyword then we perform concatenate operation then object is formed in heap.
		
		
		//line 9 me jo  neil hai woh actually double quotes me nhi likha hai and we know object in SCP is created only when there
		//is any string constant mtlb double quotes ke andar kahi string likhi honi chahiye tbhi create hogi SCP(string constant pool)
		//me vrna kisi aur tarah se string mil rhi hai to heap me create hoga object uska.
		
		//ye neil ka object alag banana isliye bhi jaruri hai kyuki iss neil ki value ek variable s3 aur il ko join krke aa rhi hai
		//mtlb ye fix nhi hai change bhi ho sakti hai like agr dobara iss coe ko acccess krte hai kahi se maan lo uss time s3 
		// ki value change ho gyi then ye neil nhi rahega to agr isko string pool me allot kr dete to string pool wala object 
		//change nhi hota ek baar create krne ke baad kyuki bahut aur bhi refrence same object ko share kr rhe haiu
	}

}
