package seleniumGrid;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {

	WebDriver driver;

	@Test(priority = 1)
	public void startBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://ineuron-courses.vercel.app/login");

	}

	@Test(priority = 2)
	public void verifyURL() {

		String actualURL = driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("ineuron"), "URL did not match");

	}

	@Test(priority = 3)
	public void verifyTitle() {
		String cTitle = driver.getTitle();
		Assert.assertTrue(cTitle.contains("Courses"), "Title Mismatch");
	}

	@Test(priority = 4)

	public void verifyFooterCount() {

		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='social-btns']/a"));
		Assert.assertEquals(elements.size(), 4);

	}

	@Test(priority = 5)
	public void verifyLogIntoApplication() {

		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Boolean manageMenu = driver.findElement(By.xpath("//*[text()='Manage']")).isDisplayed();
		Assert.assertEquals(manageMenu, true, "Not Loggged in");

	}

	@Test(priority = 6)
	public void verfiyLogoutFromApplication() {
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		Boolean newUserLink = driver.findElement(By.xpath("//*[text()='New user? Signup']")).isDisplayed();
		Assert.assertEquals(newUserLink, true, "not successfully logged out");
	}

	@Test(priority = 7)
	public void closeBrowser() {

		driver.quit();
	}
}
