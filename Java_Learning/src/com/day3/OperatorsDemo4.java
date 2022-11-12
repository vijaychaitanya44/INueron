package com.day3;

public class OperatorsDemo4 {
	public static void main(String[]args) {
		
		
		int mark = 98;
		
		if(mark >90) {
			System.out.println("A++ Grade");
		}
		else if (mark<=90 && mark>=80) {
			System.out.println("A Grade");
		}
		else if (mark<=80 && mark>=60) {
			System.out.println("B Grade");
		}
		else if(mark<=60 && mark>=35) {
			System.out.println("C Grade");
		}
		else if(mark<35) {
			System.err.println("Failed");
		}
	}

}
