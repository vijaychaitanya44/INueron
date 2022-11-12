package com.day7;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading m1 = new MethodOverLoading();
		m1.add();
		m1.add(34.5,55);
		m1.add(55.555,65.122);

	}
	
	public void add() {
		System.out.println("I am in add method");
	}
	
	public void add(int x, int y) {
		int result = x+y;
		System.out.println(result);
	}
	
	public void add(int x, double y) {
		double result = x+y;
		System.out.println(result);
	}
	
	public void add(double x, double y) {
		double result = x+y;
		System.out.println(result);
	}
	
	public void add(double x, int y) {
		double result = x+y;
		System.out.println(result);
	}
}
