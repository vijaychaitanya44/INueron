package jan21TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	

	@Test
	public void test1() {
		Reporter.log("Test line 1 executed",true);
		
		
		Assert.assertTrue(true);
		
		Reporter.log("Test line 2 executed",true);
		
	}
	
	@Test
	public void test2() {
		
		
		Reporter.log("Test case 2 first line",true);
		
		SoftAssert sf = new SoftAssert();
		
		sf.assertTrue(false);
		Reporter.log("Test case 2 second line",true);
		sf.assertAll();
	}
	
	
	
	
}
