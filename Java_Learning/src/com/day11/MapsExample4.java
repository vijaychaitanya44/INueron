package com.day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hash = new HashMap<>();

		hash.put(44, "Lewis");
		hash.put(18, "Vers");
		hash.put(3, "Seb");
		hash.put(11, "Checo");
		hash.put(63, "Russel");

		System.out.println("Hash map:" + hash);

		Map<Integer, String> link = new LinkedHashMap<>();

		link.put(44, "Lewis");
		link.put(18, "Vers");
		link.put(3, "Seb");
		link.put(11, "Checo");
		link.put(63, "Russel");

		System.out.println("Link map:" + link);

		Map<Integer, String> tm = new TreeMap<>();

		tm.put(44, "Lewis");
		tm.put(18, "Vers");
		tm.put(3, "Seb");
		tm.put(11, "Checo");
		tm.put(63, "Russel");

		System.out.println("Tree map:" + tm);

	}

}
