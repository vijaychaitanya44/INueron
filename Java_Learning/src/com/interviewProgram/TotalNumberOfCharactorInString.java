package com.interviewProgram;

public class TotalNumberOfCharactorInString {
	
	public static void main(String[] args) {
		
		String str="Madhukar Jadhav QA";
		int total=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				total++;
			}
		}
		System.out.println("Count of Chararcter :"+total);
	}

}
