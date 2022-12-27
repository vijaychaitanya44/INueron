package com.day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1 = new TreeSet<>();
		s1.add("Priya");
		s1.add("Ritika");
		s1.add("Prachi");
		s1.add("Shalini");
		s1.add("Shalini");
		s1.add("Asha");
		//s1.add(null);

		System.out.println(s1);
		
		
		Set<Integer> s2 = new TreeSet<>();
		
		s2.add(2000);
		s2.add(10);
		s2.add(89);
		s2.add(44);
		s2.add(679);
		s2.add(4);
		System.out.println(s2);
		
		
		List<String> li = new ArrayList<>(s1);
		li.addAll(s1);
		li.add("Banana");
		
		System.out.println(li);
		
	}

}
