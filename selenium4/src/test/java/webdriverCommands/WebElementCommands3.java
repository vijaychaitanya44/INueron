package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeDriver driv = new ChromeDriver();
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		
		//username.sendKeys("vijay@inueron.com");
		 WebElement userName = driver.findElement(By.id("email1"));
		 System.out.println(userName.isDisplayed());
			
			System.out.println(userName.isEnabled());
			
			System.out.println(userName.isSelected());
			
			System.out.println(userName.getAttribute("placeholder"));
			
			System.out.println(userName.getCssValue("font-size"));
			
			userName.sendKeys("inueron@inueron.ai");
			
			System.out.println(userName.getAttribute("value"));
	}
}
