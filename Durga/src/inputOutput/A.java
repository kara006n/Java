package inputOutput;
import java.io.*;
public class A {
	
	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter("abc.txt");
		FileReader f = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(f);
		System.out.println(100);
		pw.close();
		br.close();
		
	}
	

}
