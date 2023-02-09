package switchToCommandDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJavaScript {

	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
	driver.findElement(By.xpath("//div[text()='Sign In']")).click();
	
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.id("persistent"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("arguments[0].click()",ele);
	
	//jse.executeScript("document.getElementById('persistent').click()");
	
	
	
	
	}
}
