package com.day5;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = {'t','o','m'};
	
		String s1 = "Java";
		
		System.out.println(s1);
		
		String s2 = new String("Java");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));

		
		String s_Upper = s1.toUpperCase();
		String s_Lower = s1.toLowerCase();
		
		
		System.out.println("Upper case: "+s_Upper);
		System.out.println("Lower case: "+s_Lower);
		
		String s3 = "Java";
	
	}

}
