package com.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.INPUT_STREAM;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(9);
		l2.add(19);
		l2.add(29);
		ArrayList<Integer> l3 = new ArrayList<>();
		l3.add(7);
		l3.add(17);
		l3.add(27);

		multiList.add(l1);

		multiList.add(l2);

		multiList.add(l3);
		System.out.println(multiList);

		System.out.println(multiList.size());
	}

}
