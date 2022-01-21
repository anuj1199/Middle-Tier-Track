package Inheritance;

class Parent{
	Parent(){
		System.out.println("Constructor of Parent");
	}
	protected int a=100;
}
public class InheritanceProg extends Parent {
	
	InheritanceProg(){
		System.out.println("Constructor of Child");
	}
	protected int b=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceProg ip=new InheritanceProg();
		System.out.println(ip.a);
		System.out.println(ip.b);
	}
}
