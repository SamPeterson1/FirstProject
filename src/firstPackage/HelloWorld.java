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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Recognizer().recognize(i);
	}
	
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	
}
