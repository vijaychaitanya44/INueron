package jsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import customUtility.Utility;

public class Actions_DoubleClick6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		

		WebElement ele = driver.findElement(By.xpath("//span[text()='Double click the block']//preceding::div"));

		Actions as = new Actions(driver);

		as.scrollToElement(ele).perform();
		
		String color = ele.getCssValue("background-color");

		Utility.waitForSeconds(2);
		System.out.println("Before double click: "+color);
		as.doubleClick(ele).perform();
		
		System.out.println("After double click: "+ ele.getCssValue("background-color"));
		
		
		
		
	}

}
