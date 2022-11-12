package com.day6;

public class Calc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc2 obj1 = new Calc2();
		
		int sum=obj1.sum(33, 55);
		int sub=obj1.sub(44, 33);
		int mul=obj1.mul(55, 33);
		double div = obj1.div(55, 9);
		String name = obj1.getName("Vijay", "Chaitanya");
		
		System.out.println("Full name is: "+name);
		System.out.println("Sum is: "+sum);
		System.out.println("Sub is: "+sub);
		System.out.println("Mul is: "+mul);
		System.out.println("Div is: "+div);

	}

	public String getName(String fName, String lName) {
		String result = fName + lName;
		return result;
	}

	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public int sub(int a, int b) {

		int result = a - b;
		return result;
	}

	public int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	public double div(double a, double b) {
		double result = a / b;
		return result;
	}
}
