package com.interviewProgram;

import java.util.Scanner;

public class Rev_string1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String str=sc.nextLine();
		System.out.println("Orignal String : "+str);
		char CharArry[]=str.toCharArray();
		
		for(int i=CharArry.length-1;i>=0;i--) {
			System.out.print(CharArry[i]);
		}
		
	}

}
