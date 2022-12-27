package com.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> listM = new ArrayList<>();
		
		List<Integer> l1 =Arrays.asList(34,78,90);
		List<Integer> l2 =Arrays.asList(64,13,85);
		List<Integer> l3 =Arrays.asList(30,66,10);
		
		listM.add(l1);
		listM.add(l2);
		listM.add(l3);
		
		
		System.out.println(listM);
		
		System.out.println(listM.get(1).get(1));
		
		
		
		
		
		
	}

}
