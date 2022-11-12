package com.interviewProgram;

import java.util.HashSet;

public class DuplicateStringElement {
	public static void main(String[] args) {
		
	
	
		String[] arry={"Java","Selenium","Java"};

		String ch=arry.toString();
		HashSet<String> hSet=new HashSet<String>();
		System.out.println("Duplicate String Eelement is");

		for(String str:arry){
			if(!hSet.add(str)){
				System.out.println(str);
			}
		}

	}

}
