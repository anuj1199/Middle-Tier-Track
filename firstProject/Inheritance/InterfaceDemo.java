package Inheritance;

abstract class Base{
	void add() {
		System.out.println("Add base class");
	}
	abstract void substract();
}
class Derived extends Base implements Demo{
	
	void multiply() {
		System.out.println("Multiply function");
	}
	@Override
	public void accept() {
		System.out.println("Accept function");
	}
	@Override
	public void substract() {
		System.out.println("Substract function");
	}
}
public class InterfaceDemo implements Exmaple{

	@Override
	public void show() {
		System.out.println("Show function of example");
	}
	@Override
	public void display() {
		System.out.println("Display function of example");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo d=new InterfaceDemo();
		Derived de=new Derived();
		de.add();
		de.multiply();
		de.accept();
		de.substract();
		d.display();
		
		d.show();
	}
}
