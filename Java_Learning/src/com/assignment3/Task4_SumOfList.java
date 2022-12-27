package com.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task4_SumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(11, 55, 44, 33, 22, 66);

		Iterator<Integer> itr = list.iterator();

		int sum = 0;
		while (itr.hasNext()) {

			int i = itr.next();

			sum = sum + i;

		}
		System.out.println(sum);

	}
}
