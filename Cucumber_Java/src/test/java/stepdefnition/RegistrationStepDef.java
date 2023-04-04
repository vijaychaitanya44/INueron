package stepdefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class RegistrationStepDef extends BaseClass{

	@Given("User is the portal")
	public void user_is_the_portal() {
	    System.out.println("User logged on");
	    
	}

	@Given("user enters email {string}")
	public void user_enters_email(String email) {
	    System.out.println("Name is" +email);
	    
	}

	@Given("enter password as {string}")
	public void enter_password_as(String fpassword) {
	    
	    System.out.println("password is "+fpassword);
	}

	@Given("Cofirms password as {string}")
	public void cofirms_password_as(String cpassword) {
	    
	    System.out.println("confirm pasword"+cpassword);
	}

	@Then("Clicks in register button")
	public void clicks_in_register_button() {
	    
	    System.out.println("clicks register");
	}

	@Then("successfully created new user")
	public void successfully_created_new_user() {
	    System.out.println("user created");
	    
	}

}
