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
class pug extends dog{
	void breed() {
		System.out.println("Pug breed");
	}
}
public class multinhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pug p=new pug();
		p.breed();
		p.bark();
		p.eat();
	}

}
