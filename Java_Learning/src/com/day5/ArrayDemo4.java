package com.day5;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String names1[] = { "Sunil", "Raj", "Paddy", "Maddy", "Ram", "Mani" };
		
		Object names1[] = { 45, "Raj", "Paddy", 55, "Ram", "Mani",67.88,'C' };
		
		for(Object obj: names1) {
			System.out.println(obj);
		}
	}

}
