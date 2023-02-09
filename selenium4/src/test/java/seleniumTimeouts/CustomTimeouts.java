package seleniumTimeouts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomTimeouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		System.out.println(driver.manage().timeouts().getPageLoadTimeout());
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://learn-automation.com/");
		
		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		

	}

}
