package Exceptionhand;

import java.io.IOException;

public class TestTrynCatch {
	void fun() throws MyException,IOException, RuntimeException{
		System.out.println("from fun");
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		TestTrynCatch t=new TestTrynCatch();
		try {
			t.fun();
		}
		catch(ArithmeticException e) {//subclass
			System.out.println("IO");
			e.printStackTrace();
		}
		catch(RuntimeException e) {//superclass of Arithmetic
			System.out.println("Run");
			e.printStackTrace();
		}
		catch(Exception e) {//superclass of all exception
			System.out.println("Excep");
			e.printStackTrace();
		}
		System.out.println("END");
	}

}
