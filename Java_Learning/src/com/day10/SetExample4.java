package com.day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s1 = new HashSet<>();
		s1.add("Priya");
		s1.add("Ritika");
		s1.add("Prachi");
		s1.add("Shalini");

		System.out.println(s1);
		List<String> l1 = new ArrayList<>(s1);
		System.out.println(l1.get(1));
		
	}

}
