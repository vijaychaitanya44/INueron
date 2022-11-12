package com.day5;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg1 = "Price of the mobile is 2000 INR";

		String price[] = msg1.split(" ");

		System.out.println(price[5]);

		Integer rate = Integer.parseInt(price[5]);

		if (rate == 2000) {
			System.out.println("Rate is " + rate + " INR: PASS");
		} else {
			System.out.println("Rate is not equal");
		}

	}

}
