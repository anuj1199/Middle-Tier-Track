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
class cat extends Animal{
	void meow() {
		System.out.println("Meow");
	}
}
public class heirarichalinhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c=new cat();
		dog d=new dog();
		c.meow();
		c.eat();
		d.bark();
		d.eat();
	}

}
