package seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomTimeouts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		System.out.println(driver.manage().timeouts().getPageLoadTimeout());
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	System.out.println(driver.findElement(By.xpath("//p[text()='QTP']")).isDisplayed());	
	
	System.out.println("Done");
		

	}

}
