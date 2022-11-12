package com.day6;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c1 = new Calc();
		c1.sum(32,2);
		c1.div(32,2);
		c1.mul(4, 6);
		c1.sub(66, 99);
		
		
	}

	public int sum(int a, int b) {
		System.out.println("sum is: "+(a+b));
		return a+b;
	}
	
	public void sub(int a, int b) {
		
		int result = a-b;
		System.out.println("Subtrct is: "+result);
	}
	
	public void mul(int a, int b) {
		int result = a*b;
		System.out.println("Multiple is: "+result);
	}
	
	public void div(int a, int b) {
		int result = a/b;
		System.out.println("Div is: "+result);
	}
}
