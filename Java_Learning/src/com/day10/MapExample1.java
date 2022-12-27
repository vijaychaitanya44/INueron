package com.day10;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mList = new HashMap(); {
			
			mList.put("A", "Apple");
			mList.put("B", "Ball");
			mList.put("C", "Cat");
			mList.put("D", "Dog");
			
			System.out.println(mList);
			System.out.println(mList.entrySet());
			
			System.out.println(mList.get("C"));
			System.out.println(mList.get("E"));
			System.out.println(mList.containsValue("Ball"));
			mList.put("E",null);
			
			System.out.println(mList);
			
			mList.remove("E");
			System.out.println(mList);
			mList.replace("A", "Anna");
			System.out.println(mList);
			System.out.println(mList.size());
		};
	}

}
