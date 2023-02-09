package desiredCapabilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoExecution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * Selenium 3.6
		 * 
		 * Desired capability- Headless Mode /Background/ Non GUI Mode Icognito Change
		 * Directory Proxy SSL Browser extension Arguments Selenium 3.7 ChromeOptions
		 * FirefoxOPtion, EdgeOptions
		 * 
		 * Selenium Grid Desired Capability
		 * 
		 */

		ChromeOptions opt = new ChromeOptions();

	
		opt.addArguments("--incognito");
		opt.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		

		System.out.println("Title is: "+driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
