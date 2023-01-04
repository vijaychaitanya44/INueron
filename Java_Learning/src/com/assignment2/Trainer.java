package com.assignment2;



public class Trainer {

	private String name;
	private String department;
	private String email;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Trainer(String name, String department, String email, int id) {
		setName(name);
		setDepartment(department);
		setEmail(email);
		setId(id);
	}

	public void getTrainerData() {
		System.out.println("Name: "+getName());
		System.out.println("Department: "+getDepartment());
		System.out.println("Email: "+getEmail());
		System.out.println("Id: "+getId());
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

	public static void main(String[] args) {

		Trainer t1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer t2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer t3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		
		
		Trainer t[] = new Trainer[3];
		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		
		t1.testing();
		t2.dev();
		t3.devOps();
		t1.getTrainerData();

	}

}