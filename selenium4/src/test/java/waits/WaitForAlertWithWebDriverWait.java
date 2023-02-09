package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitForAlertWithWebDriverWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(text(),'start timer')]")).click();

		//String l = driver.findElement(By.xpath("//button[contains(text(),'start timer')]//preceding::p")).getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	
	String s =driver.findElement(By.xpath("//p[text()='WebDriver']")).getText();
	System.out.println(s);
	
	if (s.equals("WebDriver")) {
		System.out.println("Element displayed");
	}
	else {
		System.out.println("Not displayed");
	}
	
	driver.findElement(By.xpath("//button[contains(text(),'start timer')]")).click();
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//p[text()='QTP']"), "QTP"));
	
	
	System.out.println(driver.findElement(By.xpath("//p[text()='QTP']")).getText());
	System.out.println("displayed QTP");
	
		
		
		
		driver.quit();
		
		
	}

}
