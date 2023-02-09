package jsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import customUtility.Utility;

public class JavaScriptDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Utility.highLightElement(driver, By.name("username"));
		driver.findElement(By.name("username")).sendKeys("admin");
		
		WebElement ele = driver.findElement(By.name("password"));
		
		Utility.highLightElement(driver, ele);
		ele.sendKeys("admin123");
		
	}

}
