package seleniumGrid;

import org.testng.annotations.Test;

public class MyTestNG {

	@Test(description = "First test1")
	public void test1() {

		System.out.println("My 1st test executed ");
	}
	
	@Test(description="Second test2")
	
	public void test2() {
		System.out.println("My 2nd test executed ");
	}
	
	@Test(description="THird test3")
	
	public void test3() {
		System.out.println("My 3rd test executed ");
	}

}
