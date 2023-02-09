package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class JavaScriptDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=us");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.id("login-username"));
		WebElement checkBox = driver.findElement(By.id("persistent"));
		Utility.waitForSeconds(5);
		
		jse.executeScript("arguments[0].value='vijay@yahoo.com'",email);
		
		Utility.waitForSeconds(5);
		
		jse.executeScript("arguments[0].click()",checkBox);
		
		

	}

}
