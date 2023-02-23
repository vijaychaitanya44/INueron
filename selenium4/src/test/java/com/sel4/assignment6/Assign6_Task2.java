package com.sel4.assignment6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6_Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span"));

		List<String> menuList = new ArrayList<>();

		for (int i = 0; i < elements.size(); i++) {
			menuList.add(elements.get(i).getText());
		}
		System.out.println(menuList);

		// menu list elements displayed
		for (String menuEle : menuList) {

			driver.findElement(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span[text()='" + menuEle + "']"))
					.isDisplayed();

			System.out.println(menuEle + " From Menu has been displayed");
			System.out.println("Xpath is //ul[contains(@class,'oxd-main')]/li//a/span[text()='" + menuEle + "']))");

		}

		driver.findElement(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span[text()='Admin']")).click();

		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[@type='button'][1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");

		Thread.sleep(3000);
		List<WebElement> listDD = driver.findElements(By.xpath("//div[@role='option']"));

		List<String> autoSugList = new ArrayList<>();
		for (int j = 0; j < listDD.size(); j++) {
			autoSugList.add(listDD.get(j).getText());
		}

		System.out.println("Printing drop down list " + autoSugList);

		System.err.println("********************Finding all the Xpaths of User add modal window*******************");
		System.err.println("User Role:");
		driver.findElement(By.xpath("//*[text()='User Role']/following::div[text()='-- Select --'][1]")).click();
		System.out.println("//*[text()='User Role']/following::div[text()='-- Select --'][1]");
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Admin']")).isDisplayed();
		System.out.println("//div[@role='option']/span[text()='Admin']");
		driver.findElement(By.xpath("//div[@role='option']/span[text()='ESS']")).isDisplayed();
		System.out.println("//div[@role='option']/span[text()='ESS']");
		driver.findElement(By.xpath("//*[text()='User Role']/following::div[text()='-- Select --'][1]")).click();

		System.err.println("Status:");
		driver.findElement(By.xpath("//*[text()='Status']/following::div[text()='-- Select --'][1]")).click();
		System.out.println("//*[text()='Status']/following::div[text()='-- Select --'][1]");
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Enabled']")).isDisplayed();
		System.out.println("//div[@role='option']/span[text()='Enabled']");
		driver.findElement(By.xpath("//div[@role='option']/span[text()='Disabled']")).isDisplayed();
		System.out.println("//div[@role='option']/span[text()='Disabled']");
		driver.findElement(By.xpath("//*[text()='Status']/following::div[text()='-- Select --'][1]")).click();

		System.err.println("Employee Name:");
		driver.findElement(By.xpath("//*[text()='Employee Name']/following::input[1]")).isDisplayed();
		System.out.println("//*[text()='Employee Name']/following::input[1]");
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).isDisplayed();
		System.out.println("//input[@placeholder='Type for hints...']");
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).isDisplayed();
		System.out.println("input[placeholder='Type for hints...']");
		driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')][1]//div[contains(@class,'oxd-grid-item')][2]//input")).isDisplayed();
		System.out.println("//div[contains(@class,'oxd-form-row')][1]//div[contains(@class,'oxd-grid-item')][2]//input");
		
		
		System.err.println("User Name:");
		driver.findElement(By.xpath("//*[text()='Username']/following::input[1]")).isDisplayed();
		System.out.println("//*[text()='Username']/following::input[1]");
		driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')][1]//div[contains(@class,'oxd-grid-item')][4]//input[contains(@class,'oxd-input')]")).isDisplayed();
		System.out.println("//div[contains(@class,'oxd-form-row')][1]//div[contains(@class,'oxd-grid-item')][4]//input[contains(@class,'oxd-input')]");
		
		
		System.err.println("Password:");
		driver.findElement(By.xpath("//*[text()='Password']/following::input[1]")).isDisplayed();
		System.out.println("//*[text()='Password']/following::input[1]");
		driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')][2]//div[contains(@class,'oxd-grid-item')][1]//input[contains(@class,'oxd-input')]")).isDisplayed();
		System.out.println("//div[contains(@class,'oxd-form-row')][2]//div[contains(@class,'oxd-grid-item')][1]//input[contains(@class,'oxd-input')]");
		
		
		System.err.println("Confirm Password:");
		driver.findElement(By.xpath("//*[text()='Confirm Password']/following::input[1]")).isDisplayed();
		System.out.println("//*[text()='Confirm Password']/following::input[1]");
		driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')][2]//div[contains(@class,'oxd-grid-item')][2]//input[contains(@class,'oxd-input')]")).isDisplayed();
		System.out.println("//div[contains(@class,'oxd-form-row')][2]//div[contains(@class,'oxd-grid-item')][2]//input[contains(@class,'oxd-input')]");
		
		driver.quit();
		
	}
}
