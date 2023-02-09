package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class JavaScriptDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=us");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('login-username').value='apple@yahoo.com'");
		Utility.waitForSeconds(5);
		// click using javascript
		WebElement ele = driver.findElement(By.id("persistent"));
		jse.executeScript("arguments[0].click()",ele);
		
		Utility.waitForSeconds(5);
		
		
		
		

	}

}
