package Plymorphism;
class Demo{
	Demo(){
		System.out.println("Demo Constructor");
	}
	
	void test() {
		System.out.println("Test Fun");
	}
}
public class Test extends Demo{
	Test(){
		System.out.println("Test Constructor");
	}
	
	void test() {
		super.test();
		System.out.println("Test Fun Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.test();
	}

}
