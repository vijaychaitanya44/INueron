package calendarcontrols;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LiveExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "dummy5";
		String eMail = "dummy5@dummy.com";
		String pWd = "Dummy5#";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().window().maximize();

		driver.get("https://ineuron-courses.vercel.app/signup");

		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New user')]")).click();

		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[id*='mail']")).sendKeys(eMail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pWd);
		Boolean ele = driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("Sign up button displayed: " + ele);
		driver.findElement(By.xpath("//label[text()='Selenium']//preceding::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Male']//preceding::input[1]")).click();

		WebElement stateElements = driver.findElement(By.id("state"));
		Select sc = new Select(stateElements);

		sc.selectByVisibleText("Goa");

		Boolean ele2 = driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("Sign up button displayed: " + ele2);

		if (ele2 == true) {
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			System.out.println("Sign up completed");
			driver.findElement(By.name("email1")).sendKeys(eMail);
			driver.findElement(By.name("password1")).sendKeys(pWd);
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			System.out.println("Login successful");

			//driver.findElement(By.xpath("//button[text()='Sign out']")).click();
			//System.out.println("Logged out successfully");

		} else {
			System.out.println("Sign up not completed");
		}

		//driver.quit();
	}
}
