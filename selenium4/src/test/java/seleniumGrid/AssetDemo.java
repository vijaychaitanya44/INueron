package seleniumGrid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetDemo {

	@Test
	public void test1() {

		Assert.assertEquals(12, 12, "Count mismatch");

	}

	@Test
	public void test2() {
		Assert.assertEquals(13, 13.0, "Count mismatch");
	}

	@Test
	public void test3() {
		Assert.assertEquals("Selenium is for automation ", "Selenium for automation");
	}

	@Test
	public void test4() {
		
		String msg= "Customer is priority";
		Assert.assertEquals(msg.contains("Customer"), true);

	}
	@Test
	public void test5() {
		String msg= "Customer is priority";
		Assert.assertTrue(msg.contains("Customer"));
		Assert.fail();
	}
	
	@Test
	public void test6() {
		String msg= "Customer is priority";
		Assert.assertFalse(msg.contains("Customer"));
	}

}
