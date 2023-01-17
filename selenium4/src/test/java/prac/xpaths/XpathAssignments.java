package prac.xpaths;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait( 3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]")).sendKeys("Apple");
		
		driver.findElement(By.xpath("//input[@name='username']//following::input[1]")).sendKeys("12");
		System.out.println("Done 1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12");
		System.out.println("Done 2");
		driver.findElement(By.xpath("//*[contains(@placeholder,'password')]")).sendKeys("12");
		System.out.println("Done 3");
		driver.findElement(By.xpath("//*[contains(@placeholder,'password')]")).clear();
		/***	
		driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]")).sendKeys("Apple");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		System.out.println("Done 1");
		driver.findElement(By.cssSelector("[placeholder$='username']")).sendKeys("Admin");
		System.out.println("Done 2");
		driver.findElement(By.cssSelector("[name*='username']")).sendKeys("Admin");
		System.out.println("Done 3");
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='username']")).clear();
		System.out.println("Done 1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		System.out.println("Done 2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@name,'username')]")).clear();
		driver.findElement(By.xpath("//*[contains(@name,'username')]")).sendKeys("Admin");
		System.out.println("Done 3");
*/
	}
}
