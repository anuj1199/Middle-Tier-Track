package firstProg;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new LinkedList<String>();
		l.add("a");
		l.add("1");
		l.add("anuj");
		l.add("mathur");
		
		for(String s:l) {
			System.out.println(s);
		}
	}

}
