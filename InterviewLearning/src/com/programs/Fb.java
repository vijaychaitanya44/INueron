package com.programs;

import java.util.Scanner;

public class Fb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();

		int a=0, b=1;
		int i=0;
		int c;
		System.out.println(a);
		System.out.println(b);
		while( i <num) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			i++;
		}
		
		

	}

}
