package com.assignment3;

import java.util.ArrayList;

import java.util.List;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = new ArrayList<>();
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		num.add(77);
		num.add(88);

		num.remove(1);
		System.out.println("Remove second element from list using index: " + num);
		// [33, 55, 66, 77, 88]

		num.remove(Integer.valueOf(55));
		System.out.println("Remove second element from list using value: " + num);
		// [33, 66, 77, 88]

		num.add(3, 90);
		System.out.println("Add 90 at index 3: " + num);
		// [33, 66, 77, 90, 88]
		// Get the length of list

		System.out.println("Get the length of list: " + num.size());

		int[] numArr = new int[num.size()];

		System.out.println("Adding them to an Array");
		for (int i = 0; i < num.size(); i++) {
			numArr[i] = num.get(i);

		}
		System.out.println("Printing values using For each loop");
		for (int x : numArr) {
			System.out.println(x);
		}

	}

}
