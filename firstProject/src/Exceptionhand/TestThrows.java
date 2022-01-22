package Exceptionhand;
import java.io.*;
public class TestThrows {
	void fun() throws IOException{
		System.out.println("from fun");
		throw new IOException();
	}

	/*
	 * void validation() throws Exception{ Employee obj = new Employee();
	 * if(obj.name==null) { throw new Exception(); } else {
	 * 
	 * } }
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		TestThrows t=new TestThrows();
		t.fun();
		System.out.println("End");
	}

}
