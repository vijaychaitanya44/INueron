package com.day6;

public class Emp {

	String name;
	int empId;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp1 = new Emp("Vijay",678);
		Emp emp2 = new Emp("Sujay",900);
		Emp	emp3 = new Emp("Ramesh",323);
		emp1.displayInformation();

	}

	public void displayInformation() {
		System.out.println("Name is: " + name);
		System.out.println("EmpId is: " + empId);
	}

	public void login() {
		System.out.println("System login");

	}

	public void logOut() {
		System.out.println("System logout");

	}

	public Emp(String empName, int employeeId) {

		System.out.println("Cons called");
		name=empName;
		empId = employeeId;
		
	}
}
