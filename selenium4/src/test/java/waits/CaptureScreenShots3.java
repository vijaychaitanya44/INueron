package waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import customUtility.Utility;

public class CaptureScreenShots3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		Utility.captureScreenShot(driver);

		Utility.waitForSeconds(2);

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		Utility.waitForSeconds(10);

		Utility.captureScreenShot(driver);
		
		Utility.waitForSeconds(2);

		driver.quit();
	}

}
