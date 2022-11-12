package com.interviewProgram;

public class PalindromNo {
	public static void main(String[] args) {
		
		int num=121;
		int orgnum=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(orgnum==rev) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Plaindrom");
		}
	}

}
