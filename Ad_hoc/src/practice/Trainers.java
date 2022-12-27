package practice;

public class Trainers {

	
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

	public void setTrainerData(String name,String department,String email,int id ) {
		setName(name);
		setDepartment(department);
		setEmail(email);
		setId(id);
	}
	
	public void getTrainerData() {
		System.out.println(getName());
		System.out.println(getDepartment());
		System.out.println(getEmail());
		System.out.println(getId());
	}
	
	public void getTeachers() {
		
	}
	
	public static void main(String[] args) {
		
		Trainers t1 = new Trainers();
		Trainers t2 = new Trainers();
		Trainers t3 = new Trainers();
		
		t1.setTrainerData("Mukesh", "Testing", "mukesh@gmail.com", 1);
		t2.setTrainerData("Hitesh", "Dev", "mukesh@gmail.com", 2);
		t3.setTrainerData("Mukesh" ,"DevOps","mukesh@gmail.com",3);
		
		t1.getTrainerData();
		
	}

}
