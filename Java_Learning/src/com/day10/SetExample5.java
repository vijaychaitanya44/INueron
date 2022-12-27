package com.day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1 = new LinkedHashSet<>();
		s1.add("Priya");
		s1.add("Ritika");
		s1.add("Prachi");
		s1.add("Shalini");
		s1.add(null);
		
		System.out.println(s1);
		
		List<String> li1 = new ArrayList<>(s1);
		System.out.println(li1);
		

		
		
	}

}
