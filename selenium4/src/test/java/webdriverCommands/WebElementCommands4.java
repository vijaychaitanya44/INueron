package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ChromeDriver driv = new ChromeDriver();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		driver.findElement(By.name("lname")).sendKeys("apple");
	}

}
