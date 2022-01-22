package firstProg;
import java.util.*;
public class ArraylistEx {
	void ArrayListMethod() {
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("1");
		l.add("anuj");
		l.add("mathur");
		
		for(String s:l) {
			System.out.println(s);
		}
	}
	void LinkedListMethod() {
		List<String> l=new LinkedList<String>();
		l.add("a");
		l.add("1");
		l.add("anuj");
		l.add("mathur");
		
		for(String s:l) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraylistEx a= new ArraylistEx();
		a.ArrayListMethod();
		a.LinkedListMethod();
	}

}
