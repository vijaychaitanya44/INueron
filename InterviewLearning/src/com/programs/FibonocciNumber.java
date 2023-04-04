package com.programs;

import java.util.Scanner;

public class FibonocciNumber {

	static void m1() {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int num = sc.nextInt();

int a=0, b=1;
int i=0;
int c;
System.out.print(a+" ");
System.out.print(b);
while( i <num) {
	c=a+b;
	a=b;
	b=c;
	i++;
	System.out.print(" "+c);
}

}

	static {
		System.out.println("Apple");
		m1();
	}

	public static void main(String[] args) {

	}
}
