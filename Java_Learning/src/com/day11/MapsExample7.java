package com.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sent = "this is to test to the test auto auto is mation is good is of ";
		Map<String, Integer> hash = new LinkedHashMap<>();

		 
		String[] words = sent.split(" ");

for(String li: words) {

	
	if(hash.containsKey(li)) {
	
		hash.put(li,hash.get(li)+1);
		System.out.println(hash.get(li));
		
	}
else {
		hash.put(li, 1);
	}


	}
System.out.println(hash);
}
}