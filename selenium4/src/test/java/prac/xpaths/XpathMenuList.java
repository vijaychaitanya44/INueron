package prac.xpaths;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMenuList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait( 3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.name("username")).clear();
		
		//driver.findElement(By.cssSelector("[placeholder$='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// driver.findElements(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span")).ge

		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span"));

		elements.size();

		List<String> menuList = new ArrayList();

		for (int i = 0; i < elements.size(); i++) {
			menuList.add(elements.get(i).getText());

		}

		System.out.println(menuList);
	}

}
