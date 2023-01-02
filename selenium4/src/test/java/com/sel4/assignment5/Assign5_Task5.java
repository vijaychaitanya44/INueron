package com.sel4.assignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> fLinks = driver
				.findElements(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[contains(@href,'https')]"));

		List<String> vfootlinks = new ArrayList();

		for (int i = 0; i < fLinks.size(); i++) {
			String s = fLinks.get(i).getAttribute("href");
			vfootlinks.add(s);
		}
		System.out.println(vfootlinks);

		for (String link : vfootlinks) {

			if (link.contains("youtube")) {
				System.out.println(link);
				break;
			}
		}

	}

}
