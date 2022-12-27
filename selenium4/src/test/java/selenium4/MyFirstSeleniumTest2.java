package selenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSeleniumTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		System.out.println("Title is " + driver.getTitle());
		driver.get("https://www.facebook.com");

		System.out.println("Title is " + driver.getTitle());
		System.out.println("Current is " + driver.getCurrentUrl());

		driver.get("https://www.twitter.com");

		System.out.println("Title is " + driver.getTitle());

		Thread.sleep(10000);
		driver.quit();

	}

}
