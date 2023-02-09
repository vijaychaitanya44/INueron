package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
		

	}

}
