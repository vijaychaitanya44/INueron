package jsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import customUtility.Utility;

public class Actions_RightClick5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/contextmenu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		

		WebElement ele = driver.findElement(By.xpath("//span[text()='Right click the block']//preceding::div"));

		Actions as = new Actions(driver);

		as.scrollToElement(ele).perform();
		String color = ele.getCssValue("background-color");
		System.out.println("Before right click: "+color);
		Utility.waitForSeconds(2);
		
		as.contextClick(ele).perform();
		
		System.out.println("After right click: "+ ele.getCssValue("background-color"));
		
		
		
		
	}

}
