package jan21TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTest {

	@Test
	public void login() {
		Assert.assertTrue(true);
		Reporter.log("Login to Application",true);
		//System.out.println("Succesfully logged in");

	}
	@Test(dependsOnMethods = "login" )
	public void logout() {
		Reporter.log("log out from Application",true);
	}

}
