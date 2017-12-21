package firstPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
	
	public static void main(String args[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String i = "";
		try {
			i = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(new Calculator().calculate(new Recognizer().recognize(i)));
	}
	
}
