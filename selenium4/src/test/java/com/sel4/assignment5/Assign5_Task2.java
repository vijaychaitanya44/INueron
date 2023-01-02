package com.sel4.assignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		try {
			if (driver.findElement(By.className("orangehrm-login-logo")).isDisplayed()) {

				System.out.println("Logo is displayed");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("No logo is present. " + e.getMessage());
		}

	}
}
