package com.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5_ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Mukesh", "Sukesh", "Vijay", "Happy", "Venki" };
		System.out.println("Before adding to List: ");
		for (String n : names) {
			System.out.println(n);
		}

		List<String> nList = Arrays.asList(names);

		System.out.println("After adding to list:" + nList);

	}

}
