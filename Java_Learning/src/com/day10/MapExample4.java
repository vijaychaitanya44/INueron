package com.day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> g1 = new HashMap();
		g1.put("id", 1);
		g1.put("name", "Mukesh");
		g1.put("status", false);
		g1.put("marks", 70.05);

		Map<String, Object> g2 = new HashMap();
		g2.put("id", 34);
		g2.put("name", "Ajay");
		g2.put("status", true);
		g2.put("marks", 40);

		Map<String, Object> g3 = new HashMap();
		g3.put("id", 90);
		g3.put("name", "Vikas");
		g3.put("status", false);
		g3.put("marks", 30.99);
		
		
		Map<Integer, Map<String, Object>> allDetails = new HashMap<>();
		
		allDetails.put(1, g1);
		allDetails.put(2, g2);
		allDetails.put(3, g3);
		
		
		
		System.out.println(allDetails.get(1));
		
		System.out.println(allDetails.get(2).get("id"));
		System.out.println(allDetails.get(3).get("marks"));
	}

}
