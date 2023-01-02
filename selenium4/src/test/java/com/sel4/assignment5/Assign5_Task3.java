package com.sel4.assignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		int footerIconCount = 4;

		List<WebElement> fLinks = driver
				.findElements(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[contains(@href,'https')]"));

		if (fLinks.size() == footerIconCount) {

			System.out.println("Footer contains 4 social media Icons ");

		} else {
			System.out.println("Footer doesn't contain 4 social media Icons");
		}

	}
}
