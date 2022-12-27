package com.day10;

import java.util.HashSet;

public class SetExample2 {

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
		HashSet<String> s2 = new HashSet<>();
		
		s2.add("PHP");
		s2.add("React");
		s2.add("Js");
		
		
		System.out.println(s2);
		
		
	}

}
