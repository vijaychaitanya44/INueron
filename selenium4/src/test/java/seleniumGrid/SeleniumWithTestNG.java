package seleniumGrid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {

	WebDriver driver;
	
	@Test(priority=1)
	public void startBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://ineuron-courses.vercel.app");
		
	}
	
	@Test(priority=2)
	public void verifyURL() {
		
		String actualURL = driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("ineuron"), "URL did not match");
		
	}
	@Test(priority=3)
	public void verifyTitle() {
		String cTitle = driver.getTitle();
		Assert.assertTrue(cTitle.contains("courses"), "Title Mismatch");
	}
	@Test(priority=4)
	public void closeBrowser() {
		
		driver.quit();
	}
}
