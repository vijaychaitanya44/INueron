package seleniumGrid;

import org.testng.annotations.Test;

public class MyTestNG2 {

	@Test(priority =1)
	public void login() {

		System.out.println("Login");
	}
	
	@Test(priority=2)
	
	public void createAccount() {
		System.out.println("Account Created ");
	}
	
	@Test
	
	public void makePayment() {
		System.out.println("Make payment ");
	}
	
	@Test(priority= 4)
	
	public void logOut() {
		System.out.println("Logout ");
	}

}
