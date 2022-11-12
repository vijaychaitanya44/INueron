package com.day5;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "Sunil", "Raj", "Paddy", "Maddy", "Ram", "Mani" };

//		for (String name : names) {
//			System.out.println(name);
//		}

		for (int i = 0; i < names.length; i++) {
			//System.out.println(names[i]);
			char ch = names[i].charAt(0);
			System.out.println(ch);

		}

	}
}
