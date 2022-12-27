package com.assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task3_For_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(34, 55, 67, 90, 1, 45);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			int i = itr.next();
			System.out.println(i);
		}

	}
}
