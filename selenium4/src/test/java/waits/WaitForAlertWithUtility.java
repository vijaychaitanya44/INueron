package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class WaitForAlertWithUtility {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		//Alert ale = WaitUtility.waitForAlert(driver);
		
		Alert ale = Utility.waitForAlert(driver, 25);
		System.out.println(ale.getText());
		ale.accept();
		driver.quit();
	}

}
