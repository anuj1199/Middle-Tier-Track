package firstProg;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MapEx {

	static void HashMapMethod() {
		Map<Integer, String>map=new HashMap<Integer,String>();
		map.put(1, "Anuj");
		map.put(2, "Aditya");
		map.put(3, "Mathur");
		map.put(4, "Huny");
		//through iterator
		Set set=map.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String>entry=(Map.Entry) itr.next();
			System.out.print("key= "+entry.getKey());
			System.out.println(" value= "+entry.getValue());
		}
		//through set
		Set<Map.Entry<Integer, String>> set1=map.entrySet();
		for(Map.Entry<Integer, String>entry: set1) {
			System.out.println("key: "+entry.getKey()+" , value: "+entry.getValue());
		}
		//through keyset and values seperately
		for(Integer i:map.keySet()) {
			System.out.println("key: "+i+" Value: "+map.get(i));
		}
		for(String s:map.values()) {
			System.out.println("Value: "+s);
		}
		//Java 8 onwards
		map.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapMethod();
	}

}
