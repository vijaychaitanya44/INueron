package com.sel4.assignment6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assign6_Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String userRole = "Admin";
		String employeeName = "Peter Mac Anderson";
		String status = "Enabled";
		String userName = "Proboitic9";
		String password = "Apple44#";
		String confirmPassword = "Apple44#";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'oxd-main')]/li//a/span[text()='Admin']")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[@type='button'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='User Role']/following::div[text()='-- Select --'][1]")).click();
		driver.findElement(By.xpath("//div[@role='option']/span[text()='" + userRole + "']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(employeeName);
		Thread.sleep(3000);
		List<WebElement> listDD = driver.findElements(By.xpath("//div[@role='option']"));
		for (int j = 0; j < listDD.size(); j++) {
			if (listDD.get(j).getText().equals(employeeName))
				listDD.get(j).click();
			break;
		}
		driver.findElement(By.xpath("//*[text()='Status']/following::div[text()='-- Select --'][1]")).click();
		driver.findElement(By.xpath("//div[@role='option']/span[text()='" + status + "']")).click();
		driver.findElement(By.xpath("//*[text()='Username']/following::input[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[text()='Password']/following::input[1]")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Confirm Password']/following::input[1]")).sendKeys(confirmPassword);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Boolean saved = driver.findElement(By.xpath("//p[text()='Successfully Saved']")).isDisplayed();
		Assert.assertEquals(saved, true, "New Person not added");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Username']/following::input[1]")).sendKeys(userName);
		driver.findElement(By.xpath("//div[contains(@class,'oxd-grid-item')][2]//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("//div[@role='option']/span[text()='" + userRole + "']")).click();							
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(employeeName);
		Thread.sleep(3000);
		List<WebElement> sysUserList = driver.findElements(By.xpath("//div[@role='option']"));
		for (int j = 0; j < sysUserList.size(); j++) {
			if (sysUserList.get(j).getText().equals(employeeName))
				sysUserList.get(j).click();
			break;
		}
		driver.findElement(By.xpath("//div[contains(@class,'oxd-grid-item')][4]//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[4]//div[@role='option']/span[text()='"+status +"']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		driver.findElement(By.xpath("//div[contains(@class,'oxd-table-cel')][6]//i[contains(@class,'bi-trash')]")).click();		
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		Boolean deleted = driver.findElement(By.xpath("//p[text()='Successfully Deleted']")).isDisplayed();		
		Assert.assertEquals(deleted, true,"User not deleted");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span/p[text()='Paul Collings']")).click();	
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")).click();
		Boolean homepage =driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Assert.assertEquals(homepage, true,"not navigated homepage");
		driver.quit();
		
		

	}

}
