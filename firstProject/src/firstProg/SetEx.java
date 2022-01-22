package firstProg;
import java.util.*;
public class SetEx {
	void HashSetMethod() {
		Set<String> s=new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("a");
		for(String i:s) {//hashset Printing only unique values
			System.out.println(i);
		}
	}
	
	void LinkedHashSetMethod() {
		Set<String> s=new LinkedHashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("a");
		for(String i:s) {//Linked hashset Printing only unique values
			System.out.println(i);
		}
	}
	
	void TreeSetMethod() {
		Set<String> s=new TreeSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("a");
		for(String i:s) {//Tree set Printing only unique values. It sorts in ascending order
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetEx set=new SetEx();
		set.HashSetMethod();
		set.LinkedHashSetMethod();
		set.TreeSetMethod();
	}

}
