package Plymorphism;

public class Fnoverloading {

	public static void show() {
		System.out.println("Default fn");
	}
	public static void show(int a) {
		System.out.println("1 parameter function");
	}
	public static void show(String s, String s1) {
		System.out.println("2 String Parameter");
	}
	public static void show(int num1, int num2) {
		System.out.println("2 Integer Parameter");
	}
	public static void main(String[] args) {
		show();
		show(8);
		show(8,8);
		show("Anuj","Mathur");
	}
}
