package com.interviewProgram;

public class Rev_string {
	
	
	public static void main(String[] args) {
		
		String str="Hi Java";
		String str1="";
		
		//int length=str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+ str.charAt(i);
		}
		System.out.println(str1);
	}

}
