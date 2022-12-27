package com.day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hash = new HashMap<>();

		hash.put(44, "Lewis");
		hash.put(18, "Vers");
		hash.put(3, "Seb");
		hash.put(11, "Checo");
		hash.put(63, "Russel");
		hash.put(null, "Ricardo");
		hash.put(null, "Dani");
		hash.put(null, "Rani");
		hash.put(5, null);
		
		hash.put(42, "Lewis");
		System.out.println(hash);

		

	}

}
