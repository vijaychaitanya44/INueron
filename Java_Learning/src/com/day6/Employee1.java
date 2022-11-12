package com.day6;

public class Employee1 {
	
	static {
		System.out.println("Detail's of Employee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 narayan = new Employee1();
		
		narayan.devEngg();
		Employee1.info();
	}
	
	public void devOpsEngg() {
		
		System.out.println("I am a Devops engg");
	}

	public void automationEngg() {
		System.out.println("I can automate");
	}
	
	public void devEngg() {
		System.out.println("I can Code");
	}
	
	public static void info() {
		System.out.println("I am employee");
	}
}
