package com.day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		
		al.add("Apple");
		al.add(null);;
		al.add("");
		al.add("");
		
		System.out.println(al);
		
		
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(12);
		intList.add(44);
		intList.add(90);
		
		System.out.println(intList);
		
		ArrayList<Double> dd = new ArrayList<>();
		dd.add(200.00);
		dd.add(300.01);
		dd.add(78.23);
		
		System.out.println(dd);
		
	}

}
