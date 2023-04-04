package com.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "jumblemalyatamil";
		HashSet<Character> dup1 = new LinkedHashSet<>(); 
		char ch[]= new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			dup1.add(str.charAt(i));
			
		}
		System.out.println(dup1);
	}
}
