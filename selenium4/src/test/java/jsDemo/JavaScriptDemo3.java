package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class JavaScriptDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Utility.waitForSeconds(3);
		//jse.executeScript("document.getElementById('pass').value='password'");
		
		WebElement password =driver.findElement(By.id("pass"));
		
		//jse.executeScript("arguments[0].value='Apple'", password);
		
		
		jse.executeScript("arguments[0].value=arguments[1]", password,"TestNg");

		
		
		
		

	}

}
