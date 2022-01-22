package Inheritance;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
public class singleinhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.bark();
		d.eat();
	}

}
