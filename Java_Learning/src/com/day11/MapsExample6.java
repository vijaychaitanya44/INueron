package com.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss = "fatherofnation";
		Map<Character, Integer> hash = new HashMap<>();

		char[] letrs = ss.toCharArray();
		
		for(char l:letrs) {
			
			if(hash.containsKey(l)) {
				
				hash.put(l, hash.get(l)+1);
			}
			
			else {
				hash.put(l, 1);
			}
		}
		
		System.out.println(hash.entrySet());

	}
}
