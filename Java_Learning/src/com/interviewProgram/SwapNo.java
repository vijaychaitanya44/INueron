package com.interviewProgram;

/*
 * 
 * 01 - Java Program to Swap Two Numbers With and Without Using Third Variable
 */

public class SwapNo {

	public static void main(String[] args) {

		int a = 10, b = 20, temp;

		System.out.println("Before Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);

		temp = a; // a-10 is assign to temp

		a = b; // b value is 20, 20 is assign to a

		b = temp; // now temp value is 10, now 10 is aasign to the variable b ( Now B=10)

		System.out.println("After Swapping Two Number:" + a + "   " + b);
		System.out.println("A ==" + a);
		System.out.println("B ==" + b);
	}
}
