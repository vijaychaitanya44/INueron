package com.assignment2;

public class Trainer {

	String name;
	String department;
	String email;
	int id;

	public Trainer(String tName, String tDepartment, String tEmail, int tId) {
		name = tName;
		department = tDepartment;
		email = tEmail;
		id = tId;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer trainer1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh" ,"DevOps","mukesh@gmail.com",3);
		
		trainer1.testing();
		trainer2.dev();
		trainer3.devOps();
		
		
		Trainer t[] = new Trainer[3];
		
		t[0]= trainer1;
		t[1]= trainer2;
		t[2]= trainer3;
				
		t[0].tDetails();		
	}
	
	public void testing() {
		System.out.println("Teaches selenium");
	}

	public void dev() {
		System.out.println("Teaches Web Developement");
	}
	
	public void devOps() {
		System.out.println("Teaches Dev OPS");
	}
	
	public void tDetails() {
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Email: "+email);
		System.out.println("Id: "+id);
	}
}
