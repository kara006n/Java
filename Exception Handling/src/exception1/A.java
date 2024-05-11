 package exception1;
//exceptions are the events that occur which cann't be predicted like person came for job in psa academy but projector falls on his head then he has never 
 //thought this event might happen so this is the event which occured and will disturb normal working like he was preparing for job now that processs will be 
 //disturbed similarly in program due to some bad input provided sometimes program behaves abnormally like due to some error pnb machine which was designed to
 //submit cash in account behaved abrubplt and all notes got tore....soo as a programer we need to predict all such events and must be prepared for the 
 //events like having some backup plan so that program working doesn't stops abnormally.
 //inhi abnormal events ko exceptions bolte hai aur inko tackle krne ke liye hum kuch code likhte hau taaki humara program bhi abnormally na behave kre 
 // usko exception handling bolte hai like division ka program hai kisi ne zero value dedi denominator me then jo result hoga bahut abnormal hoga 
 //maybe program ki working crash kr jaye but agr aise case hum pehle se predict krle aur jb aisa input mile runtime pe aur machine aise abnormal state me 
 //chali jaye then ek bachup code uss program ko halt krde aur message dede error ka to ye normal execution hoga program ka instaed of giving absurd result 
 //and crashing the system. this is working of exceprion handling.
public class A {
	public static void main(String[] args) {
		int x = 0;
		int y = 10;//till here program will run normally
		int z = y/x;//here exception will occur and program execution will terminate and later line of code will never run
		
		//this exception is different from error bcoz error are wrong syntax of program or something else but here syntax of program is wrong
		//here logic is wrong not the syntax int z = y/z actually at run time y will be divide by x and then it value will be saved in left side variable z
		//but division itself will not happen and will give error.
		
		//try to run the code we will get exception bcoz java has inbuilt exception classes to handle these types  of cases.
		System.out.println(z);
		System.out.println("welcome");
	}
	
	//now lets try to handle this exception in program B of same package

}
//to move the any part of code from any place to other in class first select the code u want to move then drag that code to place where u want to move.