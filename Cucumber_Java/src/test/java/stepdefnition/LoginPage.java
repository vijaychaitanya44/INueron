package stepdefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	@Given("User is able to open application")
	public void user_is_able_to_open_application() {
		System.out.println("able to open");

	}

	@Given("user is able to land on home page with all elements")
	public void user_is_able_to_land_on_home_page_with_all_elements() {
		System.out.println("All elements loaded");

	}

	@When("user enter user name as admin")
	public void user_enter_user_name_as_admin() {
		System.out.println("user name as Admin");
	}

	@When("enter password as admin123")
	public void enter_password_as_admin123() {
		System.out.println("entered password as admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("clicked on login button");
	}

	@Then("user successfully logged in")
	public void user_successfully_logged_in() {
		System.out.println("user logged in successfully");
	}

	@Then("should be able to see the dashboard")
	public void should_be_able_to_see_the_dashboard() {
		System.out.println("dashboard loaded successfully");
	}

}
