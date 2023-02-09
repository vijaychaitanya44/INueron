package com.sel4.assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait( 3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		System.out.println("UserName by Xpaths: ");
		driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]")).sendKeys("Admin");
		System.out.println("1: //input[@name='password']//preceding::input[1])");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		System.out.println("2: //input[@placeholder='Username']");
		driver.findElement(By.xpath("//*[contains(@name,'username')]")).sendKeys("Admin");
		System.out.println("3: //*[contains(@name,'username')]");
		
		System.out.println("UserName by CSS: ");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		System.out.println("1: input[name='username']");
		driver.findElement(By.cssSelector("[placeholder$='Username']")).sendKeys("Admin");
		System.out.println("2: [placeholder$='Username']");
		driver.findElement(By.cssSelector("[name*='username']")).sendKeys("Admin");
		System.out.println("3: [name*='username']");
		
		System.out.println("Password by Xpaths: ");
		driver.findElement(By.xpath("//input[@name='username']//following::input[1]")).sendKeys("admin123");
		System.out.println("1: //input[@name='username']//following::input[1]");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		System.out.println("2: //input[@type='password']");
		driver.findElement(By.xpath("//*[contains(@placeholder,'Password')]")).sendKeys("admin123");
		System.out.println("3: //*[contains(@placeholder,'Password')]");
		
		System.out.println("Password by CSS: ");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		System.out.println("1: input[type='password']");
		driver.findElement(By.cssSelector("[name^='password']")).sendKeys("admin123");
		System.out.println("2: [name^='password']");
		driver.findElement(By.cssSelector("[placeholder*='Password']")).sendKeys("admin123");
		System.out.println("3: [placeholder*='Password']");
		
		System.out.println("Login clicks by Xpath:");
		driver.findElement(By.xpath("//input[@name='password']//following::button[1]")).click();
		System.out.println("1: //input[@name='password']//following::button[1]");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//button[(normalize-space()='Login')]")).click();
		System.out.println("2: //button[(normalize-space()='Login')]");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("3: //button[@type='submit']'");
		System.out.println();
		System.err.println("3 clicks done by Xpath");
		
		System.out.println("Login clicks by CSS:");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		System.out.println("1: [type='submit']");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("button[class$='login-button']")).click();
		System.out.println("2: button[class$='login-button']");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		System.out.println("3: button[type*='submit']");
		System.out.println();
		System.err.println("3 clicks done by CSS");
		
		driver.quit();
		
	}

}
