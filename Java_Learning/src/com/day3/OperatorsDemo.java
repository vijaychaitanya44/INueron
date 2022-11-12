package com.day3;

public class OperatorsDemo {
	
	public static void main(String[]args) {
		
		int x1 = 100;
		
		System.out.println(x1++);
		System.out.println(x1);
		
		System.out.println("************");
		
		int y1 = 100;
		System.out.println(++y1);
		System.out.println(y1);
		System.out.println("************");
		
		String name = "Vijay";
		System.out.println(10+10+20+name);
		System.out.println(name+10+10+20);
		System.out.println(10+name+20+100);
		
		System.out.println("************");
		int result = 30*5+30/2;
		System.out.println(result);
		
		int result1 = 30*(5+30)/2;
		System.out.println(result1);
		
	}

}
