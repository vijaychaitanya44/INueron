package com.assignment3;

import java.util.Arrays;
import java.util.List;

public class Task2_ForEachLoop {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(34, 55, 67, 90, 1, 45);

		for (int i : list) {
			System.out.println(i);
		}
	}

}
