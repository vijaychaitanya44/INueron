package com.interviewProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371, rem, result = 0;
		int temp = num;
		System.out.println(temp);

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = result + (rem * rem * rem);
		}
		if (result == temp) {
			System.out.println("No Is Aramstrong");
		} else {
			System.out.println("No Is Not Aramstrong");
		}

	}

}
