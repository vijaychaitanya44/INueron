package com.day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,List<String>> mList = new HashMap(); {
			
			List<String> l1 =Arrays.asList("Selenium","PlayWright","Postman");
			List<String> l2 = Arrays.asList("Java","Python","JS");
			List<String> l3 = Arrays.asList("Tesing","Dev","Admin");
			
			
			mList.put(11, l1);
			mList.put(22, l2);
			mList.put(33, l3);
			
			System.out.println(mList.entrySet());
			
			//sysoSystem.out.println(mList.get(22));
			
			//System.out.println(mList.get(12).get(0));
		};
	}

}
