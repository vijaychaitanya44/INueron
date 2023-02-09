package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import customUtility.Utility;

public class JavaScriptDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		Utility.waitForSeconds(3);
		WebElement txtArea= driver.findElement(By.xpath("//textarea"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", txtArea);
		Utility.waitForSeconds(3);

		txtArea.clear();
		
		txtArea.sendKeys("Boomber");
	}

}
