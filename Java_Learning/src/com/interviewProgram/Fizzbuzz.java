package com.interviewProgram;

public class Fizzbuzz {
	
	public static void main(String[] args) {
		int num=100;
		for(int i=0;i<=num;i++) {
			if(i%15==0) 
			System.out.println("FizzBuzz");
			else if(i%5==0)
				System.out.println("Buzz");
			else if(i%3==0)
				System.out.println("fizz");
			else
				System.out.println(i);
		}
	}

}
