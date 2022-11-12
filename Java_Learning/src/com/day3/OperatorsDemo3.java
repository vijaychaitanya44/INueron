package com.day3;

public class OperatorsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 22;

		int marks = 90;

		if (age > 21) 
		{
			if(marks>=80) {
				
				System.out.println("Congratulation!, Eligible for interview");
			}
			else {
				System.out.println("Sorry not eligible - Less marks");
			}
		}
		
		else {
			System.out.println("Sorry not eligible- age is not correct");
		}
	}

}
