package jsDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class JavaScriptDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=us");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Utility.waitForSeconds(5);
		jse.executeScript("document.getElementById('persistent').click()");
		
		Utility.waitForSeconds(5);
		
		jse.executeScript("document.getElementById('persistent').click()");

	}

}
