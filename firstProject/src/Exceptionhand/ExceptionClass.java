package Exceptionhand;
import java.io.*;
public class ExceptionClass {
	// below is the example of runtime exception.....because you get an exception at runtime.
	void divide(int b) {
		//int a=6;
		float f = 6/b;
		System.out.println(f);
	}
	// below is the example of compile time exception.....because you get an exception at compile time.
	void compileTimeException() throws EOFException {
		System.out.println("From exception");
		throw new EOFException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionClass e=new ExceptionClass();
		//e.divide(0);//not give error because it is runtime
		try {
			e.compileTimeException();
		}
		catch(EOFException g) {
			g.printStackTrace();
		}
		//e.compileTimeException();//can see error because checking at compile time.
		System.out.println("End of program");
	}
}
