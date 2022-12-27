package com.day8;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		ArrayList d = new ArrayList();
		a.add("Apple");
		a.add(123);
		a.add('c');
		a.add(null);
		a.add(false);
		a.add(null);
		a.add(null);
		a.add(new Integer(10));
		a.add(d);
		
		System.out.println(a);
		
		d.add(120);
		d.add(90.00);
		d.add("Sysy");
		System.out.println(a);
		
		a.addAll(d);
		System.out.println(a);
		
	}

}
