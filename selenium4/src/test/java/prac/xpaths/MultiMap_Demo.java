package prac.xpaths;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

public class MultiMap_Demo {

	public static void main(String[]args) {
		
	
		
		
		Multimap<String, String> multimap = ArrayListMultimap.create();
		
		multimap.put("A", "Apple");
		multimap.put("A", "Ana");
		multimap.put("A", "Azad");
		
		multimap.put("B", "Beetroot");
		multimap.put("B", "Ball");
		multimap.put("C", "Car");
		
		System.out.println(multimap.get("A"));
		 }
		
	}

