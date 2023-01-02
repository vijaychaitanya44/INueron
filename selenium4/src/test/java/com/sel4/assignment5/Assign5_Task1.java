package com.sel4.assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Capture the application url and verify url ends with “login”
		String cURL = driver.getCurrentUrl();
		String cTitle = driver.getTitle();
		if (cURL.endsWith("login")) {
			System.out.println("Url ends with 'login'");
		} else {
			System.out.println("Url not ending with 'login'");
		}
		// Capture the application url and verify url contains “demo”
		if (cURL.contains("demo")) {
			System.out.println("Url contains word 'demo'");
		} else {
			System.out.println("Url doesn't contain word 'demo'");
		}
		// Capture the application title and verify title contains HRM
		if (cTitle.contains("HRM")) {
			System.out.println("Title contains word 'HRM'");
		} else {
			System.out.println("Title doesn't contain word 'HRM'");
		}
		
		driver.close();

	}
}
