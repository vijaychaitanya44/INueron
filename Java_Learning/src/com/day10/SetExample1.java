package com.day10;

import java.util.HashSet;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s1 = new HashSet<>();
		
		s1.add("Selenium");
		s1.add("Selenium");
		s1.add("selenium");
		s1.add("Java");
		s1.add("TestNg");
		s1.add("Maven");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.remove("Java"));
		System.out.println(s1.contains("Maven"));
		
		System.out.println(s1);
	}

}
