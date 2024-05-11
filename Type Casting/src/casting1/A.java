package casting1;
//converting particular data type into required data type is known as type casting. it is of two types 1:auto upcasting 2:Explicit down casting
//analogy for this is if we will offer a man living in small house to move to bunglow definelty he will do that this is like auto upcating here 
//is done automatically we don't have to apply external force second one example is if we offer man living in bunglow to move to small house then he
//will not move we have to apply external force so is like expilicit downcasting also data class can occur pouring water frim small to large glaas is 
//fine but opposite of that will have data loss.
//converting int to long is automatically but opposite is not automatically
public class A {
	public static void main(String[] args) {
		
		//auto up casting
		//case 1
		int x =10;
		long y = x; //its auto up casting no issue automatically done
		
		//case 2
		long i =10;
		//byte j = i; this gives error because here we are moving from big house to small one so we have to done it forcefully
		//we haven't done anything this is syntax of up casting or say syntax of type casting we have to apply some force
		
		//case3
		float f = 10.3f;
		//long l = f; here we are moving from float value to int value hence we are moving from 4bytes to 8 bytes means big house to small
		//but still there this will not happen automatically because there is data loss of 0.3 
		
		//so full definition of Up casting is converting small data type to bigger data type without loss of data
		//whenever there is loss of data during conversion regardless of memory size up casting cannot happen. 
		
		//Explicit down casting:
		//converting bigger data type to smaller data type is explicit down casting
		
		int g = 10;
		byte b = (byte) g;//we know if we write byte b = g; it will give error because its syntax of upcasting or type casting but here we are moving
		//large to small so it will not happen automatically so need to apply force so the syntax for that is whitin paranthesis write the data type
		//to which you want to convert(this is actually forcing)
		
		//during conversion if there is any loss of data then regardless of memory size we need to perform explicit down casting. means if we are
		//converting from float to long then regardless of fact that memory is increasing from 4 to 8 bytes we need to perform down casting because
		//there is loss of data.
		
		int q =150;
		byte w = (byte)q;
		System.out.println(w);//now see here we are storing intentionally 150nvalue in int because i know byte range is max +128 so when we will
		//down cast there will be data loss because byte can't store 150 in memory so some bytes will be lost and whatever bytes will be left it 
		//will interpret that as data and display so result is: -106
		
		long e = 120;
		byte r = (byte)(int)e;//this format is also correct
		
		int t = 190;
		long u = (long)t;//here it's up casting no need to forcefully write (long) because its added automatically but if added by self no error
		//will be there
		
		//now the reason why we have to do downcasting by self why cant compiler do this automaticaly like upcasting its because program
		//bol raha hai ki downcasting krne me data ka loss hoga bade glass se chote me shift kroge data loss hoga agr phir bhi tumko krna hai
		//to khud se kro mai nhi krunga.
		
	}
}
