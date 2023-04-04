package com.programs;

import java.util.Scanner;

public class StringReverse {

	
	public static String reverse(String s) {
		
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp= temp+s.charAt(i);
			
		}
		s= temp;
		System.out.println(temp);
		return s;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//sc.hasNextLine();
		
		reverse("Geeks");
		
		String a = "hello";
		String b= "java";
		
		System.out.println(a.compareTo(b));

	}

}
