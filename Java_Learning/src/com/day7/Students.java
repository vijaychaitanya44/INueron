package com.day7;

public class Students {

	

	public Students() {
		System.out.println("I am default construtor");
	}

	public Students(String name, int id, long phone) {
		System.out.println("Name is: " + name + "\nId is: " + id + "\nPhone number is: " + phone);
	}

	public Students(String name, int id) {
		System.out.println("Name is: " + name + "\nId is: " + id);
	}

	public Students(int id, String name) {
		System.out.println("Name is: " + name + "\nId is: " + id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(35,"Marco");
	
	}
}
